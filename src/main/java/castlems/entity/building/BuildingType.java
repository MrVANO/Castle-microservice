package castlems.entity.building;

public enum  BuildingType {
    HOUSE("house"),
    FORGE("house"),
    COFFERS("house");

    private String value;

    BuildingType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}