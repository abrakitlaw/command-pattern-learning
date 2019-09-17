package com.company.example;

public class Stereo {

    private String name;

    private int volume;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("CD is reading");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
