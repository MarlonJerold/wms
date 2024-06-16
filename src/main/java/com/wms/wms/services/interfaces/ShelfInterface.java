package com.wms.wms.services.interfaces;

import com.wms.wms.models.Shelf;
import com.wms.wms.models.dto.ShelfRequestDTO;

import java.util.List;

public interface ShelfInterface {
    List<Shelf> getAll();
    ShelfRequestDTO createShelf(ShelfRequestDTO entity);
}
