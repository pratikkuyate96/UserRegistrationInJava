package com.bl.demo2;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void givenValidFirstName_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerFirstName("Pratik");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerFirstName("pratik");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidLastName_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerLastName("Kuyate");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerLastName("kuyate");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidEmailId_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerEmailId("pratik97@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidEmailId_shouldReturnFalse()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerEmailId("pra@_tik97@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidMobileNo_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerMobileNo("91 9687857485");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidMobileNo_shouldReturnFalse()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerMobileNo("94541 5887857485");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidPassword_shouldReturnTrue()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerPassword("PratikKuy&ate65");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidPassword_shouldReturnFalse()
    {
        UserRegistration userregister = new UserRegistration();
        boolean result = userregister.registerPassword("sh4%3");
        Assert.assertFalse(result);
    }

}