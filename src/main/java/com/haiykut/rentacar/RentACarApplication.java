package com.haiykut.rentacar;
import com.haiykut.rentacar.car.Hatchback;
import com.haiykut.rentacar.car.Sedan;
import com.haiykut.rentacar.car.Suv;
import com.haiykut.rentacar.model.Customer;
import com.haiykut.rentacar.model.Vehicle;
import com.haiykut.rentacar.user.Company;
import com.haiykut.rentacar.user.Personal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
		Customer customer1= new Personal("Halil", "deneme@mail.com", "5552223334");
		Customer customer2 = new Company("xComp", "xComp@mail.com", "5443211234");
		Vehicle vehicle1 = new Hatchback(1,"Yellow",100, Vehicle.FuelType.Electric,150);
		Vehicle vehicle2 = new Suv(2,"Red",400, Vehicle.FuelType.Diesel,200);
		Vehicle vehicle3 = new Sedan(1,"Blue",600, Vehicle.FuelType.Gasoline,300);
		System.out.println("can customer1 rent vehicle1? " + Customer.Control(customer1, vehicle1)); //true
		System.out.println("can customer1 rent vehicle2? " + Customer.Control(customer1, vehicle2)); //false
		System.out.println("can customer1 rent vehicle3? " + Customer.Control(customer1, vehicle3)); //false
		System.out.println("can customer2 rent vehicle1? " + Customer.Control(customer2, vehicle1)); //true
		System.out.println("can customer2 rent vehicle2? " + Customer.Control(customer2, vehicle2)); //true
		System.out.println("can customer2 rent vehicle3? " + Customer.Control(customer2, vehicle3)); //true
		System.out.println("vehicle1 price for 20 days: " +vehicle1.CalculateDailyRentFee(20));
		System.out.println("vehicle2 price for 2 days: " +vehicle1.CalculateDailyRentFee(2));
		System.out.println("vehicle3 price for 8 days: " +vehicle1.CalculateDailyRentFee(8));

	}

}
