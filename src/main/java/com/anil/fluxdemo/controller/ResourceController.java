package com.anil.fluxdemo.controller;

import com.anil.fluxdemo.model.Usage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Date;
import java.util.Random;

@RestController
public class ResourceController {

    public static final String[] RECOMMENDATIONS = {"chenagidira","ante le","ela unnav","pandage","namma bengaluru","namaskara"};

    @CrossOrigin(allowedHeaders = "*")
    @RequestMapping(value = "/mockAnalysis", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public ResponseEntity<String> getResourceUsage(@RequestBody(required = false) String body) {

        Random random = new Random();

        System.out.println("param id"+body);
        return ResponseEntity.status(HttpStatus.OK).body(RECOMMENDATIONS[random.nextInt(6)]);

    }
}
