package com.example.backend.service;


import com.example.backend.dto.PurchaseSummary;
import com.example.backend.exception.ItemNotFoundException;
import com.example.backend.model.Item;
import com.example.backend.model.Purchase;
import com.example.backend.repository.ItemRepository;
import com.example.backend.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {


    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private ItemRepository itemRepository;


    public Purchase createPurchase(Purchase purchase) {
        Item item = itemRepository.findById(purchase.getItem().getItem_id())
                .orElseThrow(() -> new ItemNotFoundException("Item not found with ID: " + purchase.getItem().getItem_id()));

        // Calculate amount based on item unit price and quantity
        purchase.setAmount(purchase.getQuantity() * item.getUnit_price());
        return purchaseRepository.save(purchase);
    }

    public List<PurchaseSummary> getPurchaseSummaries() {
        return purchaseRepository.findPurchaseSummaries();
    }
}




