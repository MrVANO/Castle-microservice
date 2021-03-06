package castlems.entity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "frame_object")
public class Frame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer level;
    @Column
    private String name;
    @Column
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}