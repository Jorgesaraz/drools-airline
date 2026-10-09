package com.udea.drools_airline.model;

import java.util.ArrayList;
import java.util.List;

public class BoardingResult {

    private boolean upgradedToBusiness = false;
    private boolean priorityCheckIn = false;
    private double discountPercentage = 0.0;
    private String assignedSeat = "Estándar";
    private double compensationAmount = 0.0;
    private int extraLoyaltyPoints = 0;
    private boolean luggageAllowed = true;
    private boolean vipLoungeAccess = false;
    private List<String> appliedRules = new ArrayList<>();

    public BoardingResult() {}

    public void addRuleLog(String log) {
        this.appliedRules.add(log);
    }

    // Getters y Setters
    public boolean isUpgradedToBusiness() { return upgradedToBusiness; }
    public void setUpgradedToBusiness(boolean upgradedToBusiness) { this.upgradedToBusiness = upgradedToBusiness; }

    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }

    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double discountPercentage) { this.discountPercentage = discountPercentage; }

    public String getAssignedSeat() { return assignedSeat; }
    public void setAssignedSeat(String assignedSeat) { this.assignedSeat = assignedSeat; }

    public double getCompensationAmount() { return compensationAmount; }
    public void setCompensationAmount(double compensationAmount) { this.compensationAmount = compensationAmount; }

    public int getExtraLoyaltyPoints() { return extraLoyaltyPoints; }
    public void setExtraLoyaltyPoints(int extraLoyaltyPoints) { this.extraLoyaltyPoints = extraLoyaltyPoints; }

    public boolean isLuggageAllowed() { return luggageAllowed; }
    public void setLuggageAllowed(boolean luggageAllowed) { this.luggageAllowed = luggageAllowed; }

    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }

    public List<String> getAppliedRules() { return appliedRules; }
    public void setAppliedRules(List<String> appliedRules) { this.appliedRules = appliedRules; }
}