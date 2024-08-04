package com.example.backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long purchase_Id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private long quantity;
    private double amount;
    private LocalDateTime date;

    public long getPurchase_Id() {
        return purchase_Id;
    }

    public void setPurchase_Id(long purchase_Id) {
        this.purchase_Id = purchase_Id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }



    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
