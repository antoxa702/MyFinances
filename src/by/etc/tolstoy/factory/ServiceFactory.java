package by.etc.tolstoy.factory;

import by.etc.tolstoy.service.UserService;
import by.etc.tolstoy.service.CountService;
import by.etc.tolstoy.service.impl.UserServiceImpl;
import by.etc.tolstoy.service.impl.CountServiceImpl;

/**
 * Created by Home on 20.01.2020.
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImpl();
    private final CountService countService = new CountServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public UserService getUserService(){
        return userService;
    }

    public CountService getCountService(){
        return countService;
    }
}
