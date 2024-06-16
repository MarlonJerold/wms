package com.wms.wms.services.impl;

import com.wms.wms.models.Shelf;
import com.wms.wms.models.dto.ShelfRequestDTO;
import com.wms.wms.repository.ShelfRepository;
import com.wms.wms.services.interfaces.ShelfInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfImpl implements ShelfInterface {

    private final ShelfRepository repository;

    public ShelfImpl(ShelfRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Shelf> getAll() {
        return repository.findAll();
    }

    @Override
    public ShelfRequestDTO createShelf(ShelfRequestDTO dto) {
        Shelf entitySave = repository.save(parseShelfRequestDTOforEntity(dto));
        return parseEntityForShelfReqestDTO(entitySave);
    }

    private Shelf parseShelfRequestDTOforEntity(ShelfRequestDTO dto) {
        Shelf entity = new Shelf();
        entity.setShelfName(dto.name());
        return entity;
    }

    private ShelfRequestDTO parseEntityForShelfReqestDTO(Shelf entity) {
        return new ShelfRequestDTO(
                entity.getShelfName()
        );
    }

}
