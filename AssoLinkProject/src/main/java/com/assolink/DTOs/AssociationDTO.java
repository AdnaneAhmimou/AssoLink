package com.assolink.DTOs;

import com.assolink.models.Activity;
import com.assolink.models.BaseEnity;

import java.util.ArrayList;
import java.util.List;

public class AssociationDTO  extends BaseEnity {
    private String associationName;


    private String  associationEMail;
    private String associaionPhone;
    private String associationAddress;
    private String associationDescription;
    private byte[] associationLogo;
    private String associationWebsite;
    private String associationCategory;
    private String city;
    private List<Activity> activities= new ArrayList<>();


    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public String getAssociationCategory() {
        return associationCategory;
    }

    public void setAssociationCategory(String associationCategory) {
        this.associationCategory = associationCategory;
    }

    public String getAssociationWebsite() {
        return associationWebsite;
    }

    public void setAssociationWebsite(String associationWebsite) {
        this.associationWebsite = associationWebsite;
    }

    public byte[] getAssociationLogo() {
        return associationLogo;
    }

    public void setAssociationLogo(byte[] associationLogo) {
        this.associationLogo = associationLogo;
    }

    public String getAssociationDescription() {
        return associationDescription;
    }

    public void setAssociationDescription(String associationDescription) {
        this.associationDescription = associationDescription;
    }

    public String getAssociationAddress() {
        return associationAddress;
    }

    public void setAssociationAddress(String associationAddress) {
        this.associationAddress = associationAddress;
    }

    public String getAssociaionPhone() {
        return associaionPhone;
    }

    public void setAssociaionPhone(String associaionPhone) {
        this.associaionPhone = associaionPhone;
    }

    public String getAssociationEMail() {
        return associationEMail;
    }

    public void setAssociationEMail(String associationEMail) {
        this.associationEMail = associationEMail;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
