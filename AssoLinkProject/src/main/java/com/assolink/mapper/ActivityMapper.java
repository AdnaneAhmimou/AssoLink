package com.assolink.mapper;


import com.assolink.DTOs.ActivityDTO;
import com.assolink.models.Activity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ActivityMapper {

    ActivityDTO entityToDto(Activity activity);
    Activity dtoToEntity(ActivityDTO activityDTO);
}
