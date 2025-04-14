package com.alan.avis_reclamations.repository;

import com.alan.avis_reclamations.entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvisRepository extends JpaRepository<Avis, Long> {
    List<Avis> findByUserId(Long userId); // Fetch reviews for a user
    List<Avis> findByTargetId(Long targetId); // Fetch reviews for a player/team
}