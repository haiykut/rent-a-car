package com.haiykut.rentacar.user;
import com.haiykut.rentacar.model.Customer;
public class Personal extends Customer {

    public Personal(String name, String email, String phone) {
        super(name, email, phone, CustomerType.Personal);
    }


}
