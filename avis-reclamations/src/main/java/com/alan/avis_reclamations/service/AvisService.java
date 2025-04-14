package com.alan.avis_reclamations.service;

import com.alan.avis_reclamations.entity.Avis;
import com.alan.avis_reclamations.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;

    public Avis createAvis(Avis avis) {
        return avisRepository.save(avis);
    }

    public List<Avis> getAvisByUserId(Long userId) {
        return avisRepository.findByUserId(userId);
    }

    public List<Avis> getAvisByTargetId(Long targetId) {
        return avisRepository.findByTargetId(targetId);
    }
}