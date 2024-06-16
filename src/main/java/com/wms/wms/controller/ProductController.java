package com.wms.wms.controller;


import com.wms.wms.models.Inventory;
import com.wms.wms.models.dto.ProductRequestDTO;
import com.wms.wms.models.dto.ProductResposeDTO;
import com.wms.wms.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    private ResponseEntity<List<ProductResposeDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    private ResponseEntity<ProductResposeDTO> createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        return ResponseEntity.ok(service.createProduct(productRequestDTO));
    }

}

