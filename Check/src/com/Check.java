package com;

import java.util.regex.Pattern;


public class Check {
    
    private static final String MOBILE_NUMBER_REGEX = "^(07|\\+947)([1245678]\\d{7})$";

    public static boolean isValidMobile(String mobile) {
        return Pattern.compile(MOBILE_NUMBER_REGEX).matcher(mobile).matches();
    }
    
    
    
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(gmail\\.com|yahoo\\.com|hotmail\\.com)$";
    
    public static boolean isValidEmail(String email) {
        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();
    }
    
    
    
    private static final String NAME_REGEX = "^[A-Za-z]+$";

    public static boolean isValidName(String name) {
        return Pattern.compile(NAME_REGEX).matcher(name).matches();
    }
    
    
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public static boolean isValidPassword(String password) {
        return Pattern.compile(PASSWORD_REGEX).matcher(password).matches();
    }
    
}
