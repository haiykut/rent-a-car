package com.haiykut.rentacar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MonthlyRentableVehicle extends Vehicle{
    private double monthlyRentFee;
    public MonthlyRentableVehicle(int age, String color, long luggageCap, FuelType fuelType, double dailyRentFee) {
        super(age, color, luggageCap, fuelType, dailyRentFee);
        this.monthlyRentFee = dailyRentFee * 30;
    }
    public abstract double CalculateMonthlyRentFee(int months);
}
