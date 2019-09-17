package com.company;

public class Main {

    public static void main(String[] args) {

        RemoteControlTest remoteControlTest = new RemoteControlTest();
        Light light = new Light("light");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageOnCommand = new GarageDoorUpCommand(garageDoor);

        remoteControlTest.setSlot(garageOnCommand);
        remoteControlTest.buttonPressed();
    }
}
