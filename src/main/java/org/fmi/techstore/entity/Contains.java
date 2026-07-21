package org.fmi.techstore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CONTAINS")
public class Contains {

    @EmbeddedId
    private ContainsId id;

    @ManyToOne
    @MapsId("nOrder")
    @JoinColumn(name = "NORDER")
    private Order order;

    @ManyToOne
    @MapsId("nProduct")
    @JoinColumn(name = "NPRODUCT")
    private Item item;

    @Column(name = "PRODUCTCOUNT")
    private Integer productCount;
}