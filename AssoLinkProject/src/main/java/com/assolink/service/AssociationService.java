package com.assolink.service;

import com.assolink.models.Association;
import com.assolink.repository.AssociationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociationService {
    @Autowired
    private AssociationRepository associationRepository;


    public Association createAssociation(Association association){
        if(!associationRepository.findByAssociationName(association.getAssociationName()))
            throw new RuntimeException("Association already exists");

        return associationRepository.save(association);
    }

    public Association updateAssociation(Association association) {

        Association associationFromDb = associationRepository.findById(association.getId()).get();

        if (associationFromDb == null)
            throw new RuntimeException("Association not found");

        associationFromDb.setAssociationName(association.getAssociationName());
        associationFromDb.setAssociationDescription(association.getAssociationDescription());
        associationFromDb.setAssociationEMail(association.getAssociationEMail());
        associationFromDb.setAssociaionPhone(association.getAssociaionPhone());
        associationFromDb.setAssociationAddress(association.getAssociationAddress());
        associationFromDb.setCity(association.getCity());

        return associationRepository.save(associationFromDb);
    }

    public void deleteAssociation(Long id){
        associationRepository.deleteById(id);
    }

    public List<Association> getAllAssociations(){
        return associationRepository.findAll();
    }
}
