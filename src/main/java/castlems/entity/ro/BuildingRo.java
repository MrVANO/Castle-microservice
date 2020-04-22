package castlems.entity.ro;

import castlems.entity.Building;

public class BuildingRo {
    private Long castleId;
    private String name;

    public Long getCastleId() {
        return castleId;
    }

    public void setCastleId(Long castleId) {
        this.castleId = castleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}