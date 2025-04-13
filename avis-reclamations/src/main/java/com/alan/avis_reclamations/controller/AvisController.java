package com.alan.avis_reclamations.controller;

import com.alan.avis_reclamations.entity.Avis;
import com.alan.avis_reclamations.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/avis")
    public class AvisController {

        @Autowired
        private AvisService avisService;

        @PostMapping
        public Avis createAvis(@RequestBody Avis avis) {
            return avisService.saveAvis(avis);
        }

        @GetMapping
        public List<Avis> getAllAvis() {
            return avisService.getAllAvis();
        }

        @GetMapping("/{id}")
        public Avis getAvisById(@PathVariable Long id) {
            return avisService.getAvisById(id).orElse(null);
        }

        @PutMapping("/{id}")
        public Avis updateAvis(@PathVariable Long id, @RequestBody Avis avis) {
            return avisService.updateAvis(id, avis);
        }

        @DeleteMapping("/{id}")
        public void deleteAvis(@PathVariable Long id) {
            avisService.deleteAvis(id);
        }
}
