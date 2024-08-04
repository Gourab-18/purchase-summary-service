package com.example.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplier_id;
    private String supplierName;
    private int supplierRating;

    public long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierRating() {
        return supplierRating;
    }

    public void setSupplierRating(int supplierRating) {
        this.supplierRating = supplierRating;
    }
}
