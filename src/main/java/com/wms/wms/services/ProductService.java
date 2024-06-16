package com.wms.wms.services;

import com.wms.wms.models.Product;
import com.wms.wms.models.dto.ProductRequestDTO;
import com.wms.wms.models.dto.ProductResposeDTO;
import com.wms.wms.repository.ProductRepository;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductResposeDTO> getAll(){

        List<Product> productList = repository.findAll();
        List<ProductResposeDTO> productResposeDTOList = new ArrayList<>();

        for (Product product : productList) {
            ProductResposeDTO productResposeDTO = mapProductForDtoRespose(product);
            productResposeDTOList.add(productResposeDTO);
        }
        return productResposeDTOList;
    }

    public ProductResposeDTO createProduct(ProductRequestDTO dto) {
        Product product = mapDtoForProduct(dto);
        Product productSave = repository.save(product);
        return mapProductForDtoRespose(productSave);
    }

    private Product mapDtoForProduct(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.name());
        product.setQuantity(dto.quantity());
        product.setShelfId(dto.shelfId());
        return product;
    }

    private ProductResposeDTO mapProductForDtoRespose(Product entity) {
        return new ProductResposeDTO(
                entity.id(),
                entity.name(),
                entity.quantity(),
                entity.shelfId(),
                entity.createDate(),
                entity.updateDate()
        );
    }

}
