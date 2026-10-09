package com.udea.drools_airline.service;

import com.udea.drools_airline.model.Passenger;
import com.udea.drools_airline.model.Flight;
import com.udea.drools_airline.model.BoardingResult;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {

    @Autowired
    private KieContainer kieContainer;

    public BoardingResult processPassenger(Passenger passenger, Flight flight) {
        BoardingResult result = new BoardingResult();
        KieSession kieSession = kieContainer.newKieSession();

        try {
            // Insertar los hechos (facts) en la memoria de trabajo de Drools
            kieSession.insert(passenger);
            kieSession.insert(flight);
            kieSession.insert(result);

            // Disparar las 10 reglas configuradas
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose(); // Liberar recursos de la sesión
        }

        return result;
    }
}