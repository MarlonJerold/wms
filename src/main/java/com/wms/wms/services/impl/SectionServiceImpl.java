package com.wms.wms.services.impl;

import com.wms.wms.models.Section;
import com.wms.wms.models.dto.SectionRequestDTO;
import com.wms.wms.repository.SectionRepository;
import com.wms.wms.services.interfaces.SectionServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SectionServiceImpl implements SectionServiceInterface {

    private final SectionRepository repository;

    public SectionServiceImpl(SectionRepository repository) {
        this.repository = repository;
    }

    @Override
    public SectionRequestDTO createSection(SectionRequestDTO dto) {
        Section sectionSave = repository.save(parseSectionRequestDTOForEntity(dto));
        return parseEntityForSectionRequestDTO(sectionSave);
    }

    @Override
    public List<SectionRequestDTO> getAll() {

        List<Section> sectionList = repository.findAll();
        List<SectionRequestDTO> sectionRequestDTOList = new ArrayList<>();

        for (Section sectionEntity: sectionList) {
            sectionRequestDTOList.add(
                    new SectionRequestDTO(
                            sectionEntity.getName()
                    )
            );
        }

        return sectionRequestDTOList;
    }

    public SectionRequestDTO parseEntityForSectionRequestDTO(Section entity) {
        return new SectionRequestDTO(
                entity.getName()
        );
    }

    public Section parseSectionRequestDTOForEntity(SectionRequestDTO dto) {
        Section section = new Section();
        section.setName(dto.name());
        return section;
    }
}
