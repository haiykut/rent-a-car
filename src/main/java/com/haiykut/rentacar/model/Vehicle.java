package com.haiykut.rentacar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Vehicle {
    private int age;
    private String color;
    private long luggageCap;
    private FuelType fuelType;
    private double dailyRentFee;
    public enum FuelType{
        Gasoline,
        Diesel,
        Electric
    }
    public double CalculateDailyRentFee(int day){
        return day * dailyRentFee;
    }
}
