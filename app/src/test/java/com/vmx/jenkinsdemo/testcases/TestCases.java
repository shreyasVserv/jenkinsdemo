package com.example.jenkinsdemo.testcases;



import com.example.jenkinsdemo.EmailValidator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        Assert.assertFalse  (EmailValidator.isValidEmail(""));
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        Assert.assertFalse  (EmailValidator.isValidEmail(null));
    }

}
