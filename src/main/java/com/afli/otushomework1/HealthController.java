package com.afli.otushomework1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public CustomHealth health() {
        return new CustomHealth(CustomHealth.Status.OK);
    }

}
