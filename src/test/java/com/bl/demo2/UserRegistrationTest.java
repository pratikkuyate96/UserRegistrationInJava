package com.bl.demo2;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void registerFirstName_givenFirstName_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerFirstName("Pratik");
        System.out.println("First name : "+result );
        Assert.assertTrue(result);
    }

    @Test
    public void registerLastName_givenLastName_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerLastName("Kuyate");
        System.out.println("Last name : "+result );
        Assert.assertTrue(result);
    }

    @Test
    public void registerEmailId_givenEmailId_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerEmailId("pratik97@gmail.com");
        System.out.println("Email Id : "+result );
        Assert.assertTrue(result);
    }
}