package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Address {

    @Id
    private Long addressId;

    private String street;
    private String city;
    private String country;

    @ManyToOne
    private Users user;

}
