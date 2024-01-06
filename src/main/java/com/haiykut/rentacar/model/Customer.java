package com.haiykut.rentacar.model;

import com.haiykut.rentacar.car.Hatchback;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Customer {
    private String name;
    private String email;
    private String phone;
    private CustomerType customerType;
    public enum CustomerType {
        Personal,
        Company;

    }
    public static boolean Control(Customer customer, Vehicle vehicle) {
        if (customer.getCustomerType() == CustomerType.Company)
            return true;
        else
            return vehicle instanceof Hatchback;
    }


}
