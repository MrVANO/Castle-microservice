package castlems.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Building extends Frame {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "castle_id")
    @JsonBackReference
    private Castle castle;

    @Column
    private String type;

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                '}';
    }
}