package com.wms.wms.services;

import com.wms.wms.models.Product;
import com.wms.wms.models.dto.ProductRequestDTO;
import com.wms.wms.models.dto.ProductResposeDTO;
import com.wms.wms.repository.ProductRepository;
import org.hibernate.type.descriptor.DateTimeUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
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

            DateTimeFormatter formatter = DateTimeUtils.DATE_TIME_FORMATTER_DATE;
            String createDateString = product.createDate().format(formatter);
            String updateDateString = product.updateDate().format(formatter);

            ModelMapper mapper = new ModelMapper();
            ProductResposeDTO productResposeDTO = mapper.map(product, ProductResposeDTO.class);
            productResposeDTOList.add(productResposeDTO);
        }

        return productResposeDTOList;
    }

    public ProductResposeDTO createProduct(ProductRequestDTO dto) {

        ModelMapper mapper = new ModelMapper();
        Product product = mapper.map(dto, Product.class);

        Product productSave = repository.save(product);
        ProductResposeDTO productResposeDTO = mapper.map(productSave, ProductResposeDTO.class);
        return productResposeDTO;
    }




}
