package by.etc.tolstoy.controller.impl;

import by.etc.tolstoy.controller.command.Command;

/**
 * Created by Home on 21.01.2020.
 */
public class WrongRequest implements Command {
    @Override
    public String execute(String request) {
        return "WRONG_REQUEST";
    }
}
