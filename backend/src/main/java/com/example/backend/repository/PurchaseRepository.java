package com.example.backend.repository;

import com.example.backend.dto.PurchaseSummary;
import com.example.backend.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PurchaseRepository extends JpaRepository<Purchase, Long> {


    @Query("SELECT new com.example.backend.dto.PurchaseSummary(p.item.supplier.supplier_id, p.item.item_id, MONTH(p.date), SUM(p.quantity), SUM(p.quantity * p.item.unit_price)) " +
            "FROM Purchase p " +
            "GROUP BY p.item.supplier.supplier_id, p.item.item_id, MONTH(p.date) " +
            "ORDER BY MONTH(p.date)")
    List<PurchaseSummary> findPurchaseSummaries();



}
