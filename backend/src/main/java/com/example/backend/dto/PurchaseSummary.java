package com.example.backend.dto;

public class PurchaseSummary {

    private long supplier_id;

    private long item_id;
    private int month;
    private long quantity;
    private double amount;

    public PurchaseSummary(long supplier_id,long item_id, int month, long quantity, double amount) {


        this.supplier_id = supplier_id;
        this.item_id = item_id;
        this.month = month;
        this.quantity = quantity;
        this.amount = amount;
    }

    public long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public long getItemId() {
        return item_id;
    }

    public void setItemId(long itemId) {
        this.item_id = itemId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
