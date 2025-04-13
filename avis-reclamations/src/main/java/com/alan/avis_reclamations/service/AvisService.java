package com.alan.avis_reclamations.service;

import com.alan.avis_reclamations.entity.Avis;
import com.alan.avis_reclamations.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;

    public Avis saveAvis(Avis avis) {
        return avisRepository.save(avis);
    }

    public List<Avis> getAllAvis() {
        return avisRepository.findAll();
    }

    //find solution for this error !!!
 /*
    public Optional<Avis> getAvisByIdUser(Long id) {
        return avisRepository.findByIdUser(id);
    }

    public void deleteAvis(Long id) {
        avisRepository.deleteById(id);
    }

*/
}
