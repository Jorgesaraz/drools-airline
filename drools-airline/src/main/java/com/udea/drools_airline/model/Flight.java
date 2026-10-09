package com.udea.drools_airline.model;

import jakarta.validation.constraints.NotBlank;

public class Flight {

    @NotBlank(message = "El número de vuelo es obligatorio")
    private String flightNumber;

    private int delayMinutes;           // Retraso en minutos
    private double durationHours;       // Duración del vuelo en horas
    private boolean emergencyExitAvailable; // Asiento de salida de emergencia libre

    public Flight() {}

    public Flight(String flightNumber, int delayMinutes, double durationHours, boolean emergencyExitAvailable) {
        this.flightNumber = flightNumber;
        this.delayMinutes = delayMinutes;
        this.durationHours = durationHours;
        this.emergencyExitAvailable = emergencyExitAvailable;
    }

    // Getters y Setters
    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public int getDelayMinutes() { return delayMinutes; }
    public void setDelayMinutes(int delayMinutes) { this.delayMinutes = delayMinutes; }

    public double getDurationHours() { return durationHours; }
    public void setDurationHours(double durationHours) { this.durationHours = durationHours; }

    public boolean isEmergencyExitAvailable() { return emergencyExitAvailable; }
    public void setEmergencyExitAvailable(boolean emergencyExitAvailable) { this.emergencyExitAvailable = emergencyExitAvailable; }
}