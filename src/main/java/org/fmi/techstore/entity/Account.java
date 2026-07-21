package org.fmi.techstore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    @Column(name = "USERNAME", length = 30)
    private String username;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "PHONE", length = 10)
    private String phone;

    @Column(name = "ADDRESS", length = 30)
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}