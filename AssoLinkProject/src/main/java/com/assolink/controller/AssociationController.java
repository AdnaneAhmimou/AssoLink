package com.assolink.controller;


import com.assolink.DTOs.AssociationDTO;
import com.assolink.mapper.AssociationMapper;
import com.assolink.models.Association;
import com.assolink.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/association")
public class AssociationController {


    @Autowired
    private AssociationService associationService;
    @Autowired
    private AssociationMapper associationMapper;

    @PostMapping("/create")
    public ResponseEntity<AssociationDTO> createAssociation(@RequestBody AssociationDTO associationDTO){

       Association association = associationMapper.dtoToEntity(associationDTO);

        AssociationDTO associationDTOfromDB = associationMapper.entityToDto(associationService.createAssociation(association));

       return new ResponseEntity<>(associationDTOfromDB, HttpStatus.CREATED);

    }


    @PostMapping("/update")
    public ResponseEntity<Association> updateAssociation(@RequestBody AssociationDTO associationDTO){

        Association association = associationMapper.dtoToEntity(associationDTO);

        return new ResponseEntity<>(associationService.updateAssociation(association), HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<Void> deleteAssociation(@RequestBody Long id){
        associationService.deleteAssociation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
