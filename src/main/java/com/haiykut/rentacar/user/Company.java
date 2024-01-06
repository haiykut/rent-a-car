package com.haiykut.rentacar.user;
import com.haiykut.rentacar.model.Customer;
public class Company extends Customer {
    public Company(String name, String email, String phone){
        super(name,email,phone, CustomerType.Company);

    }



}
