package com.epam.hw.registration.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Matcher
{
	private final String email = "([.[^@\\s]]+)@([.[^@\\s]]+)\\.([a-z]+)";
    private final String login = "([.[^@\\s]]+)";
    private final String password = "([.[^@\\s]]+)";
    
    private final Pattern emailPattern = Pattern.compile(email);
    private final Pattern loginPattern = Pattern.compile(login);
    private final Pattern passwordPattern = Pattern.compile(password);

    private Map <String, Pattern> mathcherMar = new HashMap<String, Pattern> ();

    public Map<String, Pattern> makeMap () {
    	mathcherMar.put("email", emailPattern);
    	mathcherMar.put("login", loginPattern);
    	mathcherMar.put("password", passwordPattern);

    	return mathcherMar;
    }

    public String getEmail() {
        return "email";
    }

    public String getLogin() {
        return "login";
    }
    public String getPassword(){

        return "password";
    }
}
