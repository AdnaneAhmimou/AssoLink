package com.assolink.controller;

import com.assolink.DTOs.ActivityDTO;
import com.assolink.DTOs.AssociationDTO;
import com.assolink.mapper.ActivityMapper;
import com.assolink.models.Activity;
import com.assolink.models.Association;
import com.assolink.service.ActivityService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;
    @Autowired
    private ActivityMapper activityMapper;

    @PostMapping("/create")
    public ResponseEntity<ActivityDTO> createActivity(@RequestBody ActivityDTO activityDTO){

        Activity activity = activityMapper.dtoToEntity(activityDTO);
        ActivityDTO activityDTOfromDB = activityMapper.entityToDto(activityService.createActivity(activity));

        return new ResponseEntity<>(activityDTOfromDB, HttpStatus.CREATED);
    }



    @PostMapping("/update")
    public ResponseEntity<Activity> updateActivity(@RequestBody ActivityDTO activityDTO){

        Activity activity = activityMapper.dtoToEntity(activityDTO);

        return new ResponseEntity<>(activityService.updateActivity(activity), HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<Void> deleteActivity(@RequestBody Long id){
        activityService.deleteActivity(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
