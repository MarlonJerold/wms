package com.wms.wms.models;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private String shelfId;

    // Construtor
    public Product(String id, String name, int quantity, String shelfId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.shelfId = shelfId;
    }
}
