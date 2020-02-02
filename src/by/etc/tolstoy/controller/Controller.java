package by.etc.tolstoy.controller;

import by.etc.tolstoy.controller.command.Command;

/**
 * Created by Home on 20.01.2020.
 */
public final class Controller {

    private final CommandProvider provider = new CommandProvider();

    private final char paramDelimeter = ' ';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;

        // String parsing to get comandName

        commandName = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);

        return response;
    }
}
