package com.udea.drools_airline.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Passenger {

    @NotBlank(message = "El nombre del pasajero es obligatorio")
    private String name;

    @NotNull(message = "La edad es obligatoria")
    @Min(value = 0, message = "La edad no puede ser negativa")
    private int age;

    @NotBlank(message = "El nivel de membresía es obligatorio")
    private String membershipLevel; // "Basic", "Gold", "Platinum"

    private double luggageWeight;   // Peso del equipaje en kg
    private String seatPreference;  // "Window", "Aisle", "Any", etc.
    private boolean travelingWithChildren;
    private int loyaltyPoints;
    private boolean eligibleForUpgrade = true; // Por defecto es elegible

    public Passenger() {}

    public Passenger(String name, int age, String membershipLevel, double luggageWeight,
                     String seatPreference, boolean travelingWithChildren, int loyaltyPoints) {
        this.name = name;
        this.age = age;
        this.membershipLevel = membershipLevel;
        this.luggageWeight = luggageWeight;
        this.seatPreference = seatPreference;
        this.travelingWithChildren = travelingWithChildren;
        this.loyaltyPoints = loyaltyPoints;
        this.eligibleForUpgrade = true;
    }

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMembershipLevel() { return membershipLevel; }
    public void setMembershipLevel(String membershipLevel) { this.membershipLevel = membershipLevel; }

    public double getLuggageWeight() { return luggageWeight; }
    public void setLuggageWeight(double luggageWeight) { this.luggageWeight = luggageWeight; }

    public String getSeatPreference() { return seatPreference; }
    public void setSeatPreference(String seatPreference) { this.seatPreference = seatPreference; }

    public boolean isTravelingWithChildren() { return travelingWithChildren; }
    public void setTravelingWithChildren(boolean travelingWithChildren) { this.travelingWithChildren = travelingWithChildren; }

    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }

    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }
}