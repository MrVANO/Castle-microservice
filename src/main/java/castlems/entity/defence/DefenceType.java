package castlems.entity.defence;

public enum DefenceType {
    BALLISTA("ballista"),
    BARRAKS("barraks"),
    MOAT("moat"),
    WALLS("walls");


    private String value;

    DefenceType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}