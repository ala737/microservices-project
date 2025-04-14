package com.alan.avis_reclamations;


import com.alan.avis_reclamations.entity.Avis;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "avis-notification-service")
public interface AvisFeignClient {

    @GetMapping("/avis/target/{targetId}")
    List<Avis> getAvisByTargetId(@PathVariable("targetId") Long targetId);
}