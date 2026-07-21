package org.fmi.techstore.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ContainsId implements Serializable {

    private Integer nOrder;
    private Integer nProduct;

    public ContainsId() {}

    public ContainsId(Integer nOrder, Integer nProduct) {
        this.nOrder = nOrder;
        this.nProduct = nProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContainsId)) return false;
        ContainsId that = (ContainsId) o;
        return Objects.equals(nOrder, that.nOrder)
                && Objects.equals(nProduct, that.nProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nOrder, nProduct);
    }
}