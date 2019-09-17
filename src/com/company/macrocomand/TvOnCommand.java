package com.company.macrocomand;

import com.company.Command;

public class TvOnCommand implements Command {

    Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
