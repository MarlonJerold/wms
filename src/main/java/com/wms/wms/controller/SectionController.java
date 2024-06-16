package com.wms.wms.controller;

import com.wms.wms.models.Section;
import com.wms.wms.models.dto.SectionRequestDTO;
import com.wms.wms.services.interfaces.SectionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/section")
@Controller
public class SectionController {

    @Autowired(required = false)
    private SectionServiceInterface service;

    @GetMapping
    private ResponseEntity<List<SectionRequestDTO>> getAllSection() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    private ResponseEntity<SectionRequestDTO> createSection(@RequestBody SectionRequestDTO dto) {
        return ResponseEntity.ok(service.createSection(dto));
    }

}
