package by.etc.tolstoy.controller;

import by.etc.tolstoy.controller.command.Command;
import by.etc.tolstoy.controller.command.CommandName;
import by.etc.tolstoy.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Home on 20.01.2020.
 */
public class CommandProvider {

    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.REGISTRATION, new Register());
        repository.put(CommandName.ADD_COUNT, new AddCount());
        repository.put(CommandName.ADD_TRANSACTION, new AddTransaction());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
        //...
    }

    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;

        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
