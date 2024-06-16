package com.wms.wms.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Table(name = "product")
@Entity()
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "product_name")
    private String name;
    private int quantity;

    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "update_date")
    private LocalDate updateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shelf_id")
    private Shelf shelf;

    public Product(UUID id, String name, int quantity, Shelf shelf, LocalDate createDate, LocalDate updateDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.shelf = shelf;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Product() {}

    public Product(String name, int quantity, String s) {
    }

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

    public Shelf shelfId() {
        return shelf;
    }

    public void setShelfId(Shelf shelf) {
        this.shelf = shelf;
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
