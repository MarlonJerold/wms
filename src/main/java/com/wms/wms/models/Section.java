package com.wms.wms.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "section_name")
    private String name;

    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Shelf> shelves;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    public Section(UUID id, String name) {
        this.id = id;
        this.name = name;
        this.shelves = new ArrayList<>();
    }

    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }
}
