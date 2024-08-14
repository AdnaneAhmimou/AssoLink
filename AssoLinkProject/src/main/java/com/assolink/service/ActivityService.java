package com.assolink.service;

import com.assolink.models.Activity;
import com.assolink.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;


import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity createActivity(Activity activity){
        return activityRepository.save(activity);
    }

    public Activity updateActivity(Activity activity){

        Activity activityFromDb = activityRepository.findById(activity.getId()).get();

        if(activityFromDb== null)
            throw new RuntimeException("Activity not found");

        activityFromDb.setDescription(activity.getDescription());
        activityFromDb.setAssociation(activity.getAssociation());
        activityFromDb.setMaxParticipants(activity.getMaxParticipants());
        activityFromDb.setType(activity.getType());
        activityFromDb.setLibelle(activity.getLibelle());
        activityFromDb.setAdresse(activity.getAdresse());
        activityFromDb.setCity(activity.getCity());
        activityFromDb.setFree(activity.isFree());
        activityFromDb.setImage(activity.getImage());

        return activityRepository.save(activityFromDb);
    }

    public void deleteActivity(Long id){
        activityRepository.deleteById(id);
    }

    public Activity getActivity(Long id){
        return activityRepository.findById(id).get();
    }




    public List<Activity> getAllActivities(){
        Sort sort = Sort.by(Sort.Direction.ASC, "city");
        return activityRepository.findAll(sort);
    }
}
