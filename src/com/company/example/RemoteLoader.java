package com.company.example;

import com.company.*;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");

        Light kitchenLight = new Light("Kitchen");

        GarageDoor garageDoor = new GarageDoor();

        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);

        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);}
}
