package castlems.entity.building;

import castlems.entity.Building;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Coffers extends Building {
    @Column
    private Integer capacity;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}