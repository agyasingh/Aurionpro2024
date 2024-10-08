package com.aurionpro.test;

import com.auionpro.model.Command;
import com.auionpro.model.RemoteControl;
import com.auionpro.model.TV;
import com.auionpro.model.TurnOnCommand;

public class Client {
    public static void main(String[] args) {
        // Receiver
        TV tv = new TV();

        // Concrete Command
        Command turnOn = new TurnOnCommand(tv);

        // Invoker
        RemoteControl remote = new RemoteControl();
        remote.setCommand(turnOn);

        // Execute Command
        remote.pressButton(); // This turns the TV on
    }
}                                                         