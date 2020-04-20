package com.bl.demo2;

public class UserRegistration {
    public static final String PATTERN_OF_FIRSTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_LASTNAME="^[A-Z][a-z]{2,}$";
    public static final String PATTERN_OF_EMAILID="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,4}$";
    public static final String PATTERN_OF_MOBILENO="^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    public static final String PATTERN_OF_PASSWORD="^[a-z][A-Z]{8,}$";

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

    public boolean registerMobileNo(String mobileNo)
    {
        return mobileNo.matches(PATTERN_OF_MOBILENO);
    }

    public boolean registerPassword(String password)
    {
        return password.matches(PATTERN_OF_PASSWORD);
    }

}