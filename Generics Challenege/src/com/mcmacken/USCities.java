package com.mcmacken;
public class USCities extends Point {
    private String name;

    public USCities(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
