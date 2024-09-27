package com.mcmacken;

public class USInterstates extends Line {

    private String name;

    public USInterstates(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
