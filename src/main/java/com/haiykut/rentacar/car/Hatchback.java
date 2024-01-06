package com.haiykut.rentacar.car;
import com.haiykut.rentacar.model.MonthlyRentableVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hatchback extends MonthlyRentableVehicle {
    private double monthlyRentFee;
    public Hatchback(int age, String color, long luggageCap,FuelType fuelType, double dailyRentFee){
        super(age, color, luggageCap, fuelType, dailyRentFee);
        this.monthlyRentFee = dailyRentFee * 30;
    }
    @Override
    public double CalculateMonthlyRentFee(int months) {
        return months * getMonthlyRentFee() * 3;
    }

}
