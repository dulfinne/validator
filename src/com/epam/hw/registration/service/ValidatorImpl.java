package com.epam.hw.registration.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;


public class ValidatorImpl implements Validator{

    private Matcher checker = new Matcher();

    private final String separator = ", ";
    private String message = "OK";
    private final Map<String, Pattern> matcherMap = checker.makeMap();
    private String errorMessage = "Incorrect data. Try again  ";

    private final String keyLogin = checker.getLogin();
    private final String keyEmail = checker.getEmail();
    private final String keyPassword = checker.getPassword();


    @Override
    public String validate(String value) {

        String stringData[] = value.split(separator);
        String userLogin = stringData[0];
        String userPassword = stringData[1];
        String userEmail = stringData[2];

        if (!matcherMap.get(keyLogin).matcher(userLogin).matches()) {

            message = errorMessage + keyLogin;

        }
        if (!matcherMap.get(keyPassword).matcher(userPassword).matches()) {

            message = errorMessage + keyPassword;
        }
        if (!matcherMap.get(keyEmail).matcher(userEmail).matches()) {


            message = errorMessage + keyEmail;


        }

        if (matcherMap.get(keyLogin).matcher(userLogin).matches()
                && matcherMap.get(keyPassword).matcher(userPassword).matches()
            && matcherMap.get(keyEmail).matcher(userEmail).matches()){
            message = message;
        }


        return message;
    }

}