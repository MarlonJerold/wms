package com.wms.wms.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;


@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "product_name")
    private String name;
    private int quantity;
    @Column(name = "self_id")
    private String shelfId;

    private LocalDate createDate;
    private LocalDate updateDate;

    public Product(UUID id, String name, int quantity, String shelfId, LocalDate createDate, LocalDate updateDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.shelfId = shelfId;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Product() {}

    public UUID id() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int quantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String shelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }
    public LocalDate createDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate updateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
