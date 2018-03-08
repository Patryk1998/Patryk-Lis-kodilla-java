package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public final class Product {
    private int id;
    private String name;
    private Item item;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRODUCTNAME")
    @NotNull
    public String getName() {
        return name;
    }

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    public Item getItem() {
        return item;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
