package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name = "manufacture")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public Manufacturer(){}

    public Manufacturer(long id, String nameManufacture) {
        this.id = id;
        this.nameManufacture = nameManufacture;
    }

    private String nameManufacture;

    public String getNameManufacture() {
        return nameManufacture;
    }

    public void setNameManufacture(String nameManufacture) {
        this.nameManufacture = nameManufacture;
    }



    public Manufacturer(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
