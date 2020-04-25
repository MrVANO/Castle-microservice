package castlems.entity.defence;

import castlems.entity.Defence;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Walls extends Defence{

    @Column
    private Integer thickness;
    @Column(name = "tower_count")
    private Integer towerCount;

    public Integer getThickness() {
        return thickness;
    }

    public void setThickness(Integer thickness) {
        this.thickness = thickness;
    }

    public Integer getTowerCount() {
        return towerCount;
    }

    public void setTowerCount(Integer towerCount) {
        this.towerCount = towerCount;
    }
}