package org.fmi.techstore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @Column(name = "ORDERNUM")
    private Integer orderNum;

    @Column(name = "BILLINGADDR", length = 100)
    private String billingAddr;

    @Column(name = "DELIVERYADDR", length = 100)
    private String deliveryAddr;

    @ManyToOne
    @JoinColumn(name = "USER")
    private Account user;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    private List<Contains> contains;
}