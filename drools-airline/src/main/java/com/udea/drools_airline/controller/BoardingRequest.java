package com.udea.drools_airline.controller;

import com.udea.drools_airline.model.Passenger;
import com.udea.drools_airline.model.Flight;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class BoardingRequest {

    @NotNull(message = "El pasajero es obligatorio")
    @Valid
    private Passenger passenger;

    @NotNull(message = "El vuelo es obligatorio")
    @Valid
    private Flight flight;

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }
}