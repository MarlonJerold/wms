package com.wms.wms.controller;

import com.wms.wms.models.dto.ShelfRequestDTO;
import com.wms.wms.services.interfaces.ShelfInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/shelf")
@Controller
public class ShelfController {

    @Autowired(required = false)
    private ShelfInterface service;

    @PostMapping
    private ResponseEntity<ShelfRequestDTO> createShelf(@RequestBody ShelfRequestDTO dto) {
        return ResponseEntity.ok(service.createShelf(dto));
    }

}
