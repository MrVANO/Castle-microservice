package castlems.entity.building;

import castlems.entity.Building;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Forge extends Building {

    @Column(name = "weaponcraft_enabled")
    private boolean weaponcraftEnabled;

    @Column(name = "armorcraft_enabled")
    private boolean armorcraftEnabled;

    public boolean isWeaponcraftEnabled() {
        return weaponcraftEnabled;
    }

    public void setWeaponcraftEnabled(boolean weaponcraftEnabled) {
        this.weaponcraftEnabled = weaponcraftEnabled;
    }

    public boolean isArmorcraftEnabled() {
        return armorcraftEnabled;
    }

    public void setArmorcraftEnabled(boolean armorcraftEnabled) {
        this.armorcraftEnabled = armorcraftEnabled;
    }
}