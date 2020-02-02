package by.etc.tolstoy.controller.impl;

import by.etc.tolstoy.controller.command.Command;
import by.etc.tolstoy.service.UserService;
import by.etc.tolstoy.exception.service.ServiceClientException;
import by.etc.tolstoy.factory.ServiceFactory;

/**
 * Created by Home on 20.01.2020.
 */
public class Register implements Command {
    @Override
    public String execute(String request) {
        String login = null;
        String password = null;

        String response = null;

        String [] requestArray = request.split("\\s+");
        login = requestArray[1].trim();
        password = requestArray[2].trim();

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        try {
            userService.registration(login, password);
            response = "You've registered successfully";
        } catch (ServiceClientException e) {
            // write log
            response = "Error during registration";
        }
        return response;
    }
}
