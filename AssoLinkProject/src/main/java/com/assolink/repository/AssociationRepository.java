package com.assolink.repository;

import com.assolink.models.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long>{

    boolean findByAssociationName(String associationName);
}
