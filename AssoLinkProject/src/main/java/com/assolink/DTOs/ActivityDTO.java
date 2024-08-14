package com.assolink.DTOs;

import com.assolink.enums.TypeActivity;
import com.assolink.models.Association;
import com.assolink.models.BaseEnity;

public class ActivityDTO extends BaseEnity {
    private String libelle;

    private String description;

    private TypeActivity type;

    private Association association;

    private int maxParticipants;

    private String city;

    private String adresse ;

    private boolean free ;



    private byte[] image;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeActivity getType() {
        return type;
    }

    public void setType(TypeActivity type) {
        this.type = type;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
