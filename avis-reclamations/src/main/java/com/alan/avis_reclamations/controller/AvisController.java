package com.alan.avis_reclamations.controller;


import com.alan.avis_reclamations.entity.Avis;
import com.alan.avis_reclamations.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avis")
public class AvisController {

    @Autowired
    private AvisService avisService;

    @PostMapping
    public Avis createAvis(@RequestBody Avis avis) {
        return avisService.createAvis(avis);
    }

    @GetMapping("/user/{userId}")
    public List<Avis> getAvisByUserId(@PathVariable Long userId) {
        return avisService.getAvisByUserId(userId);
    }

    @GetMapping("/target/{targetId}")
    public List<Avis> getAvisByTargetId(@PathVariable Long targetId) {
        return avisService.getAvisByTargetId(targetId);
    }
}