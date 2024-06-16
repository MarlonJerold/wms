package com.wms.wms.models.dto;

import com.wms.wms.models.Shelf;

public record ProductRequestDTO(String name, int quantity, Shelf shelfId){

};