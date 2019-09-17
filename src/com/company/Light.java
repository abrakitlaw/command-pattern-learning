package com.company;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Lights is on");
    }

    public void off() {
        System.out.println("Light is off");
    }

    public String getName() {
        return name;
    }
}
