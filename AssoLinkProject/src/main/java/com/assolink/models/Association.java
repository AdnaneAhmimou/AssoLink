package com.assolink.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "association")
public class Association extends  BaseEnity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String associationName;



    @Email
    private String associationEMail;
    private String associaionPhone;
    private String associationAddress;
    private String associationDescription;
    private byte[] associationLogo;
    private String associationWebsite;
    private String associationCategory;
    private String city;


    @OneToMany
    private List<Activity> activities= new ArrayList<>();


    public Association() {
super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssociationEMail() {
        return associationEMail;
    }

    public void setAssociationEMail(String associationEMail) {
        this.associationEMail = associationEMail;
    }

    public String getAssociaionPhone() {
        return associaionPhone;
    }

    public void setAssociaionPhone(String associaionPhone) {
        this.associaionPhone = associaionPhone;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getAssociationAddress() {
        return associationAddress;
    }

    public void setAssociationAddress(String associationAddress) {
        this.associationAddress = associationAddress;
    }

    public String getAssociationDescription() {
        return associationDescription;
    }

    public void setAssociationDescription(String associationDescription) {
        this.associationDescription = associationDescription;
    }

    public byte[] getAssociationLogo() {
        return associationLogo;
    }

    public void setAssociationLogo(byte[] associationLogo) {
        this.associationLogo = associationLogo;
    }

    public String getAssociationWebsite() {
        return associationWebsite;
    }

    public void setAssociationWebsite(String associationWebsite) {
        this.associationWebsite = associationWebsite;
    }

    public String getAssociationCategory() {
        return associationCategory;
    }

    public void setAssociationCategory(String associationCategory) {
        this.associationCategory = associationCategory;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
