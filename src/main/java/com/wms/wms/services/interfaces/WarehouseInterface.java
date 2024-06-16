package com.wms.wms.services.interfaces;

import com.wms.wms.models.Warehouse;
import com.wms.wms.models.dto.WarehouseRequestDTO;

import java.util.List;

public interface WarehouseInterface {

    List<Warehouse> getAll();
    WarehouseRequestDTO createWarehouse(WarehouseRequestDTO account);

}
