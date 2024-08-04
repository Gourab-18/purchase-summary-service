package com.example.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="items")

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long item_id;

    private String item_name;

    private double unit_price;


    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
}
