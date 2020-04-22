package castlems.service;

import castlems.entity.Building;
import castlems.entity.Castle;
import castlems.entity.building.BuildingType;
import castlems.entity.building.Coffers;
import castlems.entity.building.Forge;
import castlems.entity.building.House;
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

    //region public methods

    public Long createCoffers(Long castleId, String name) {
        Coffers coffers = new Coffers();
        coffers = (Coffers) initBuidling(coffers, castleId, name, BuildingType.COFFERS);
        coffers.setCapacity(10000);
        return createBuilding(coffers);
    }

    public Long createForge(Long castleId, String name) {
        Forge forge = new Forge();
        forge = (Forge) initBuidling(forge, castleId, name, BuildingType.FORGE);
        forge.setArmorcraftEnabled(false);
        forge.setWeaponcraftEnabled(false);
        return createBuilding(forge);
    }

    public Long createHouse(Long castleId, String name) {
        House house = new House();
        house = (House) initBuidling(house, castleId, name, BuildingType.HOUSE);
        house.setBedsCount(10);
        return createBuilding(house);
    }

    //endregion


    //region private methods

    private Long createBuilding(Building building) {
        buildingRepository.saveAndFlush(building);
        return building.getId();
    }

    private Building initBuidling(Building building, Long castleId, String name, BuildingType type) {
        Castle castle = castleRepository.findById(castleId).get();
        building.setCastle(castle);
        building.setLevel(1);
        building.setName(name);
        building.setState("A");
        building.setType(type.getValue());
        return building;
    }

    //endregion
}