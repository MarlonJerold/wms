package com.wms.wms.repository;

import com.wms.wms.models.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShelfRepository extends JpaRepository<Shelf, UUID> {
}
