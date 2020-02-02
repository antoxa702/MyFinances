package by.etc.tolstoy.controller.impl;

import by.etc.tolstoy.controller.command.Command;
import by.etc.tolstoy.service.CountService;
import by.etc.tolstoy.service.exception.ServiceCountException;
import by.etc.tolstoy.service.factory.ServiceFactory;

/**
 * Created by Home on 21.01.2020.
 */
public class AddCount implements Command {
    public String execute(String request) {
        String countName = null;
        double balance = 0.0;

        String response = null;

        String [] requestArray = request.split("\\s+");
        countName = requestArray[1].trim();
        balance = Double.parseDouble(requestArray[2].trim());

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CountService countService = serviceFactory.getCountService();

        try {
            countService.addCount(countName, balance + "");
            response = "You've added count " + countName + " successfully";
        } catch (ServiceCountException e) {
            response = "Error during adding count";
        }
        return response;
    }
}
