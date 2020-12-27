package com.example.domain;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nameCountry;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }



    public Country(){}

    public Country(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setId(long id, String nameCountry) {
        this.id = id;
        this.nameCountry = nameCountry;
    }
}
