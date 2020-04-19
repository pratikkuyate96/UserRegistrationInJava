package com.bl.demo2;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void registerFirstName_givenFirstName_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerFirstName("Xyzz");
        System.out.println("First name : "+result );
        Assert.assertTrue(result);
    }

    @Test
    public void registerLastName_givenLastName_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerLastName("Abc");
        System.out.println("Last name : "+result );
        Assert.assertTrue(result);
    }
}