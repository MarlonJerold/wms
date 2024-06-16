package com.wms.wms.services;

import com.wms.wms.models.Warehouse;
import com.wms.wms.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    private final WarehouseRepository repository;

    public WarehouseService(WarehouseRepository repository) {
        this.repository = repository;
    }

    public List<Warehouse> getAll() {
        return repository.findAll();
    }

}
