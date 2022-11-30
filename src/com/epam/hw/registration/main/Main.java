package com.epam.hw.registration.main;

import com.epam.hw.registration.service.ValidatorImpl;

public class Main {
    public static void main(String[] args)  {

        ValidatorImpl validator = new ValidatorImpl();
        String toCheck = "kellyan, 3tardd1, garanikab21@mail.ru";
        System.out.println(validator.validate(toCheck));

    }
}