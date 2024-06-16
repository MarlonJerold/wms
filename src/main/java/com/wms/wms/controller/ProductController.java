package com.wms.wms.controller;


import com.wms.wms.models.dto.ProductRequestDTO;
import com.wms.wms.models.dto.ProductResposeDTO;
import com.wms.wms.services.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired(required = false)
    private ProductServiceInterface service;

    @GetMapping
    private ResponseEntity<List<ProductResposeDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    private ResponseEntity<ProductResposeDTO> createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        return ResponseEntity.ok(service.createProduct(productRequestDTO));
    }

}

