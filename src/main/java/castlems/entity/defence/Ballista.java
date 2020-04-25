package castlems.entity.defence;

import castlems.entity.Defence;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Ballista extends Defence{

    @Column
    private Integer range;
    @Column(name = "rate_of_fire")
    private Integer rateOfFire;

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Integer getRateOfFire() {
        return rateOfFire;
    }

    public void setRateOfFire(Integer rateOfFire) {
        this.rateOfFire = rateOfFire;
    }
}