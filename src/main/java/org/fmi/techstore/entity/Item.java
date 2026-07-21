package org.fmi.techstore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ITEMS")
public class Item {

    @Id
    @Column(name = "PRODUCTNUM")
    private Integer productNum;

    @Column(name = "AVAILABILITY")
    private Integer availability;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "BRAND", length = 30)
    private String brand;

    @Column(name = "CATEGORY", length = 25)
    private String category;

    @JsonIgnore
    @OneToMany(mappedBy = "item")
    private List<Contains> contains;
}