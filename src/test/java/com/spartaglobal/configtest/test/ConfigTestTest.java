package com.spartaglobal.configtest.test;

import com.spartaglobal.configtest.ConfigTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConfigTestTest
{
    @Test
    public void testGetMessage()
    {
        ConfigTest ct = new ConfigTest();
        String actual = ct.getMessage("Autumn");
        String expected = "Welcome to Sparta, Autumn!";
        Assertions.assertEquals(expected, actual);
    }
}
