package com.wms.wms.services.impl;

import com.wms.wms.models.Warehouse;
import com.wms.wms.models.dto.WarehouseRequestDTO;
import com.wms.wms.repository.WarehouseRepository;
import com.wms.wms.services.interfaces.WarehouseInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseInterface {

    private final WarehouseRepository repository;

    public WarehouseServiceImpl(WarehouseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Warehouse> getAll() {
        return repository.findAll();
    }

    @Override
    public WarehouseRequestDTO createWarehouse(WarehouseRequestDTO dto) {
        Warehouse save = repository.save(parseWarehouseRequestForEntity(dto));
        return parseEntityForWarehouseRequestDTO(save);
    }

    public Warehouse parseWarehouseRequestForEntity(WarehouseRequestDTO dto) {
        Warehouse warehouse = new Warehouse();
        warehouse.setName(dto.name());
        warehouse.setLocation(dto.localization());
        return warehouse;
    }

    public WarehouseRequestDTO parseEntityForWarehouseRequestDTO(Warehouse entity) {
        return new WarehouseRequestDTO(
                entity.getName(),
                entity.getLocation()
        );
    }

}
