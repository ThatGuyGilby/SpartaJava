package com.spartaglobal.configtest;

public class ConfigTest
{
    public static void main(String[] args)
    {
        ConfigTest ct = new ConfigTest();
        System.out.println(ct.getMessage("Mihai"));
    }

    public String getMessage(String name)
    {
        return "Welcome to Sparta, " + name + "!";
    }
}