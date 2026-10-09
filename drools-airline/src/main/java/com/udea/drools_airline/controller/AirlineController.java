package com.udea.drools_airline.controller;

import com.udea.drools_airline.model.BoardingResult;
import com.udea.drools_airline.service.AirlineService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airline")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @PostMapping("/evaluate")
    public BoardingResult evaluateBoarding(@Valid @RequestBody BoardingRequest request) {
        return airlineService.processPassenger(request.getPassenger(), request.getFlight());
    }
}