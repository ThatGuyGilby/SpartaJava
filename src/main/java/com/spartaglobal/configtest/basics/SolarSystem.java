package com.spartaglobal.configtest.basics;

import java.util.Locale;

public class SolarSystem
{
    public static void main(String[] args)
    {
        Planet[] planets = new Planet[Planet.values().length];

        for (int i = 0; i < planets.length; i++)
        {
            planets[i] = Planet.values()[i];
        }

        for (int i = 0; i < planets.length; i++)
        {
            System.out.println(planets[i].toString() + " - Mass: " + planets[i].getMass() + " kg" + " - Average Distance From Sun: " + planets[i].getAverageDistanceFromSun() + " meters");
        }
    }
}
