package com.wms.wms.services.interfaces;

import com.wms.wms.models.dto.SectionRequestDTO;

import java.util.List;

public interface SectionServiceInterface {
    SectionRequestDTO createSection(SectionRequestDTO entity);
    List<SectionRequestDTO> getAll();
}
