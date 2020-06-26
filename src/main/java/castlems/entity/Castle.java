package castlems.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "castle")
public class Castle extends Frame {
    @Column
    private Integer population;
    @Column
    private Integer gold;
    @Column
    private String user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "castle")
    private List<Building> buildings;
    @OneToMany
    @JoinColumn(name = "castle_id")
    private List<Defence> defences;

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public List<Building> getBuildings() {
        if(buildings == null) {
            buildings = new ArrayList<>();
        }
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Defence> getDefences() {
        return defences;
    }

    public void setDefences(List<Defence> defences) {
        this.defences = defences;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "population=" + population +
                ", gold=" + gold +
                ", user='" + user + '\'' +
                ", buildings=" + buildings +
                ", defences=" + defences +
                '}';
    }
}