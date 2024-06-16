package com.wms.wms.controller;

import com.wms.wms.models.Warehouse;
import com.wms.wms.models.dto.WarehouseRequestDTO;
import com.wms.wms.services.interfaces.WarehouseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("warehouse")
public class WarehouseController {

    @Autowired(required = false)
    private WarehouseInterface service;

    @GetMapping
    public ResponseEntity<List<Warehouse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<WarehouseRequestDTO> createWarehouse(@RequestBody WarehouseRequestDTO dto) {
        return ResponseEntity.ok(service.createWarehouse(dto));
    }

}
