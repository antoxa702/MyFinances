package by.etc.tolstoy.dao;

import by.etc.tolstoy.exception.dao.DAOCantCreateFileException;
import by.etc.tolstoy.exception.dao.DAOUserException;
import by.etc.tolstoy.exception.dao.DAOUserRegistrationException;
import by.etc.tolstoy.exception.dao.DAOUserSignInException;

/**
 * Created by Home on 20.01.2020.
 */
public interface UserDAO {
    void signIn(String login, String password) throws DAOUserException, DAOUserSignInException;
    void registration(String login, String password) throws DAOUserException, DAOUserRegistrationException, DAOCantCreateFileException;
}
