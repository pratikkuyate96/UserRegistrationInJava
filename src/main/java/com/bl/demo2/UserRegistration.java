package com.bl.demo2;

public class UserRegistration {
    public static final String PATTERN_OF_FIRSTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_LASTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_EMAILID="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,4}$";

    public boolean registerFirstName(String firstName)
    {
        return firstName.matches(PATTERN_OF_FIRSTNAME);
    }
    public boolean registerLastName(String lastName)
    {
        return lastName.matches(PATTERN_OF_LASTNAME);
    }
    public boolean registerEmailId(String emailId)
    {
        return emailId.matches(PATTERN_OF_EMAILID);
    }
}