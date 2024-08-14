package com.assolink.models;

import com.assolink.enums.TypeActivity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(name = "activity")
public class Activity  extends BaseEnity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    private String description;

    private TypeActivity type;


    @ManyToOne
    @JoinColumn(name = "association_id")
    @JsonIgnore
    private Association association;

    private int maxParticipants;


    private String adresse ;

    private boolean free ;

    private String city;



    private byte[] image;




    public Activity(String libelle, String description, TypeActivity type, Association association, int maxParticipant) {
        super();
        this.libelle = libelle;
        this.description = description;
        this.type = type;
        this.association = association;
        this.maxParticipants = maxParticipants;
    }


    public Activity() {
        super();
    }



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

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
