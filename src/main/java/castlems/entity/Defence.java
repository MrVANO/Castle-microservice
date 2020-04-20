package castlems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Defence extends Frame {
    @Column
    private String type;
    @Column
    private Integer hp;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Defence{" +
                "type='" + type + '\'' +
                ", hp=" + hp +
                '}';
    }
}