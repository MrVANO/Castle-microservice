package castlems.service;

import castlems.entity.Castle;
import castlems.entity.Defence;
import castlems.entity.building.Coffers;
import castlems.entity.defence.*;
import castlems.repository.CastleRepository;
import castlems.repository.DefenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefenceService {

    @Autowired
    private DefenceRepository defenceRepository;
    @Autowired
    private CastleRepository castleRepository;

    public DefenceService(DefenceRepository defenceRepository, CastleRepository castleRepository) {
        this.defenceRepository = defenceRepository;
        this.castleRepository = castleRepository;
    }

    //region public methods

    public Long createBallista(Long castleId, String name) {
        Ballista ballista = new Ballista();
        ballista = (Ballista) initDefence(ballista, castleId, name, DefenceType.BALLISTA);
        ballista.setRange(50);
        ballista.setRateOfFire(1);
        return createDefence(ballista);
    }

    public Long createBarraks(Long castleId, String name) {
        Barraks barraks = new Barraks();
        barraks = (Barraks) initDefence(barraks, castleId, name, DefenceType.BARRAKS);
        barraks.setGarrisonStrength(20);
        return createDefence(barraks);
    }

    public Long createMoat(Long castleId, String name) {
        Moat moat = new Moat();
        moat = (Moat) initDefence(moat, castleId, name, DefenceType.MOAT);
        moat.setDepth(2);
        return createDefence(moat);
    }

    public Long createWalls(Long castleId, String name) {
        Walls walls = new Walls();
        walls = (Walls) initDefence(walls, castleId, name, DefenceType.WALLS);
        walls.setThickness(2);
        walls.setTowerCount(1);
        return createDefence(walls);
    }

    //endregion


    //region private methods

    private Long createDefence(Defence defence) {
        defenceRepository.saveAndFlush(defence);
        return defence.getId();
    }

    private Defence initDefence(Defence defence, Long castleId, String name, DefenceType type) {
        Castle castle = castleRepository.findById(castleId).get();
        defence.setCastle(castle);
        defence.setHp(100);
        defence.setLevel(1);
        defence.setName(name);
        defence.setState("A");
        defence.setType(type.getValue());
        return defence;
    }

    //endregion
}