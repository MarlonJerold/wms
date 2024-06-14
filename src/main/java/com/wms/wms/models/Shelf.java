package com.wms.wms.models;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private String id;
    private String sectionId;
    private List<Product> products;

    // Construtor
    public Shelf(String id, String sectionId) {
        this.id = id;
        this.sectionId = sectionId;
        this.products = new ArrayList<>();
    }

    // Métodos getters e setters

    // Método para adicionar um produto
    public void addProduct(Product product) {
        products.add(product);
    }
}
