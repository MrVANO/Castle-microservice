package castlems.entity.ro;

import castlems.entity.Building;

public class BuildingRo {
    private Building building;
    private Long castleId;

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Long getCastleId() {
        return castleId;
    }

    public void setCastleId(Long castleId) {
        this.castleId = castleId;
    }
}