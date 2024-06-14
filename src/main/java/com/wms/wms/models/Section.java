package com.wms.wms.models;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String id;
    private String name;
    private List<Shelf> shelves;

    // Construtor
    public Section(String id, String name) {
        this.id = id;
        this.name = name;
        this.shelves = new ArrayList<>();
    }

    // Métodos getters e setters

    // Método para adicionar uma prateleira
    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }
}
