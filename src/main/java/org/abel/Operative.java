package org.abel;

import java.io.File;
import java.io.IOException;

public class Operative {
    final static private String aria2Path = GlobalConfig.getAria2Path();
    private String commands;

    public Operative() {
        commands = "cmd /c start aria2c";
        basicCommand();
    }

    void basicCommand() {
        addCommand("--log="+"\""+aria2Path+File.separator+GlobalConfig.getLogFile()+"\"");
        addCommand("--dir="+"\""+GlobalConfig.getDirPath()+"\"");
        addCommand("--split="+GlobalConfig.getFileSplit());
        addCommand(" --file-allocation="+GlobalConfig.getAllocation());
        addCommand("--continue="+GlobalConfig.getDownContinue());
        addCommand("--min-split-size="+GlobalConfig.getSplitSize());
    }

    public void addCommand(String command) {
        commands = commands + " " + command;
    }

    String getCommands() {
        return commands;
    }

    public void run() throws IOException, InterruptedException {
        String[] arr = {"path=" + aria2Path};
        Process process = Runtime.getRuntime().exec(getCommands(), arr, new File(aria2Path));
        process.waitFor();

        process.destroy();
    }
}
