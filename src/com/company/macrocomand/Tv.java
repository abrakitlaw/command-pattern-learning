package com.company.macrocomand;

public class Tv {

    private String name;

    public Tv(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("TV on");
    }

    public void off() {
        System.out.println("TV off");
    }

    public String getName() {
        return name;
    }
}
