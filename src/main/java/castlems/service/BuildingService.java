package castlems.service;

import castlems.entity.Building;
import castlems.entity.Castle;
import castlems.repository.BuildingRepository;
import castlems.repository.CastleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BuildingService {

    @Autowired
    private final BuildingRepository buildingRepository;

    @Autowired
    private final CastleRepository castleRepository;

    public BuildingService(BuildingRepository buildingRepository, CastleRepository castleRepository) {
        this.buildingRepository = buildingRepository;
        this.castleRepository = castleRepository;
    }

    public Long createBuidling(Building building, Long castleId) {
        Castle castle = castleRepository.findById(castleId).get();
        building.setCastle(castle);
        buildingRepository.saveAndFlush(building);
        return building.getId();
    }
}