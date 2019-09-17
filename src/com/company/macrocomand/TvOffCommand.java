package com.company.macrocomand;

import com.company.Command;

public class TvOffCommand implements Command {

    Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
