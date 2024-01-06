package com.haiykut.rentacar.car;

import com.haiykut.rentacar.model.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Suv extends Vehicle {
    public Suv(int age, String color, long luggageCap, FuelType fuelType, double dailyRentFee) {
        super(age, color, luggageCap, fuelType, dailyRentFee);
    }

}
