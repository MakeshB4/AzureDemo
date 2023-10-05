package com.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;


    private String firstName;
    private String lastName;


    private String emailId;

    private int age;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Address> address;

}
