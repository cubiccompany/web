package com.example.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float price;
    private String nameProduct;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;
    private String filename;


    public void setFilename(String filename) {
        this.filename = filename;
    }
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    private Set<Country> country;



    public Product(long id, float price, String nameProduct, User author, String filename) {
        this.id = id;
        this.price = price;
        this.nameProduct = nameProduct;
        this.author = author;
        this.filename = filename;
       // this.country = country;
    }

    public Product(){

    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<none>";
    }
    public void setAuthor(User author) {
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
//
//    public Set<Country> getCountry() {
//        return country;
//    }
//
//    public void setCountry(Set<Country> country) {
//        this.country = country;
//    }
}
