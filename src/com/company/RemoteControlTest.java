package com.company;

public class RemoteControlTest {

    private Command slot;

    public RemoteControlTest() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
