package com.spartaglobal.configtest.basics;

public enum Planet
{
    MERCURY(328500000000000000000000.0,500330000.0),
    VENUS(4867000000000000000000000.0,1074800000.0),
    EARTH(5972000000000000000000000.0,1472800000.0),
    MARS(639000000000000000000000.0,2263900000.0),
    JUPITER(1898000000000000000000000000.0,7464700000.0),
    SATURN(568300000000000000000000000.0,14808000000.0),
    URANUS(86810000000000000000000000.0,29493000000.0),
    NEPTUNE(102400000000000000000000000.0,44747000000.0);

    private final double mass;
    private final double averageDistanceFromSun;

    Planet(double _mass, double _averageDistanceFromSun)
    {

        this.mass = _mass;
        this.averageDistanceFromSun = _averageDistanceFromSun;
    }

    public double getMass()
    {
        return mass;
    }

    public double getAverageDistanceFromSun()
    {
        return averageDistanceFromSun;
    }
}
