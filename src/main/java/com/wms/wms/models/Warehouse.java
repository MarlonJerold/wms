package com.wms.wms.models;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String id;
    private String name;
    private String location;
    private List<Section> sections;

    // Construtor
    public Warehouse(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.sections = new ArrayList<>();
    }

    // Métodos getters e setters

    // Método para adicionar uma seção
    public void addSection(Section section) {
        sections.add(section);
    }
}
