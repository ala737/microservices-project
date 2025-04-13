package com.alan.avis_reclamations.repository;

import com.alan.avis_reclamations.entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisRepository extends JpaRepository<Avis, Integer> {

}
