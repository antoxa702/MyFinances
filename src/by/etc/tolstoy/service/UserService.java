package by.etc.tolstoy.service;

import by.etc.tolstoy.bean.User;
import by.etc.tolstoy.service.exception.NullLoginException;
import by.etc.tolstoy.service.exception.NullUserException;
import by.etc.tolstoy.service.exception.ServiceClientException;

/**
 * Created by Home on 20.01.2020.
 */
public interface UserService {
    void signIn(String login, String password) throws ServiceClientException;
    void singOut(User user, String login) throws ServiceClientException, NullUserException, NullLoginException;
    void registration (String login, String password) throws ServiceClientException;
}
