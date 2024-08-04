package com.example.backend.controller;

import com.example.backend.dto.PurchaseSummary;
import com.example.backend.model.Purchase;
import com.example.backend.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;


    @PostMapping
    public Purchase createPurchase(@RequestBody Purchase purchase) {
        return purchaseService.createPurchase(purchase);
    }

    @GetMapping("/summaries")
    public List<PurchaseSummary> getPurchaseSummaries() {
        return purchaseService.getPurchaseSummaries();
    }
}
