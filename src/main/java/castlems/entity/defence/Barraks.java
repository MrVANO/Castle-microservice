package castlems.entity.defence;

import castlems.entity.Defence;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Barraks extends Defence {

    @Column(name = "garrison_strength")
    private Integer garrisonStrength;

    public Integer getGarrisonStrength() {
        return garrisonStrength;
    }

    public void setGarrisonStrength(Integer garrisonStrength) {
        this.garrisonStrength = garrisonStrength;
    }
}