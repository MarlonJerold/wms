package com.wms.wms.services.interfaces;

import com.wms.wms.models.dto.ProductRequestDTO;
import com.wms.wms.models.dto.ProductResposeDTO;

import java.util.List;

public interface ProductServiceInterface {
    List<ProductResposeDTO> getAll();
    ProductResposeDTO createProduct(ProductRequestDTO dto);
}
