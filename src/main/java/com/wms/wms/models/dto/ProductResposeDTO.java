package com.wms.wms.models.dto;

import com.wms.wms.models.Shelf;

import java.time.LocalDate;
import java.util.UUID;

public record ProductResposeDTO(UUID id, String name, int quantity, Shelf shelfId, LocalDate createDate, LocalDate updateDate) {

}