package castlems.entity.building;

import castlems.entity.Building;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class House extends Building{
    @Column(name = "beds_count")
    private Integer bedsCount;

    public Integer getBedsCount() {
        return bedsCount;
    }

    public void setBedsCount(Integer bedsCount) {
        this.bedsCount = bedsCount;
    }
}