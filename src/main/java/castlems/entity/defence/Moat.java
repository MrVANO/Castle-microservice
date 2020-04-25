package castlems.entity.defence;

import castlems.entity.Defence;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Moat extends Defence {

    @Column
    private Integer depth;

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }
}