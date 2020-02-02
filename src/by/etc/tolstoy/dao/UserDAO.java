package by.etc.tolstoy.dao;

import by.etc.tolstoy.bean.User;
import by.etc.tolstoy.dao.exception.DAOCantCreateFileException;
import by.etc.tolstoy.dao.exception.DAOUserException;
import by.etc.tolstoy.dao.exception.DAOUserRegistrationException;
import by.etc.tolstoy.dao.exception.DAOUserSignInException;

/**
 * Created by Home on 20.01.2020.
 */
public interface UserDAO {
    void signIn(String login, String password) throws DAOUserException, DAOUserSignInException;
    void registration(String login, String password) throws DAOUserException, DAOUserRegistrationException, DAOCantCreateFileException;
}
