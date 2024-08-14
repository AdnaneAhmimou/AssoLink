package com.assolink.mapper;

import com.assolink.DTOs.AssociationDTO;
import com.assolink.models.Association;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface AssociationMapper {


    AssociationDTO entityToDto(Association association);
    Association dtoToEntity(AssociationDTO associationDTO);


}
