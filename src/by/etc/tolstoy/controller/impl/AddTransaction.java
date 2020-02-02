package by.etc.tolstoy.controller.impl;

import by.etc.tolstoy.controller.command.Command;
import by.etc.tolstoy.service.CountService;
import by.etc.tolstoy.service.exception.ServiceCountException;
import by.etc.tolstoy.service.factory.ServiceFactory;

/**
 * Created by Home on 20.01.2020.
 */
public class AddTransaction implements Command{
    @Override
    public String execute(String request) {
        String countName = null;
        String type = null;
        double money = 0.0;

        String response = null;

        String [] requestArray = request.split("\\s+");

        countName = requestArray[1].trim();
        type = requestArray[2].trim();
        money = Double.parseDouble(requestArray[3].trim());

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CountService countService = serviceFactory.getCountService();

        try {
            countService.addTransaction(countName, type, money + "");
            response = "You've added transaction on " + countName + " type: " + type + " money: " + money + " successfully";
        } catch (ServiceCountException e) {
            response = "Error during adding transaction";
        }
        return response;
    }
}
