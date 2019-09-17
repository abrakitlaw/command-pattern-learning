package com.company.macrocomand;

import com.company.Command;
import com.company.Light;
import com.company.LightOnCommand;
import com.company.example.*;

public class PartyMode {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Tv tv = new Tv("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn= {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ----");
        remoteControl.onButtonPushed(0);

        System.out.println("--- Pusing Macro Off ---");
        remoteControl.offButtonPushed(0);
    }
}
