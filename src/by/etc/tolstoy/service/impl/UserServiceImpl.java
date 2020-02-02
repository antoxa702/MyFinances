package by.etc.tolstoy.service.impl;

import by.etc.tolstoy.bean.User;
import by.etc.tolstoy.exception.dao.DAOCantCreateFileException;
import by.etc.tolstoy.exception.dao.DAOUserException;
import by.etc.tolstoy.exception.dao.DAOUserRegistrationException;
import by.etc.tolstoy.exception.dao.DAOUserSignInException;
import by.etc.tolstoy.factory.DAOFactory;
import by.etc.tolstoy.dao.UserDAO;
import by.etc.tolstoy.service.UserService;
import by.etc.tolstoy.exception.service.NullLoginException;
import by.etc.tolstoy.exception.service.NullUserException;
import by.etc.tolstoy.exception.service.ServiceClientException;

/**
 * Created by Home on 20.01.2020.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void signIn(String login, String password) throws ServiceClientException {

        // проверяем параметры
        if(login == null || login.isEmpty()){
            throw new ServiceClientException("Incorrect login");
        }

        if(password == null || password.isEmpty()){
            throw new ServiceClientException("Incorrect password");
        }

        try{
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.signIn(login, password);
        } catch (DAOUserException e) {
            throw new ServiceClientException(e);
        } catch (DAOUserSignInException e) {
            throw new ServiceClientException(e);
        }

    }

    @Override
    public void singOut(User user, String login) throws NullUserException, NullLoginException {
        if (user  == null) {
            throw new NullUserException("user == null");
        }

        if (login == null || login.isEmpty()){
            throw new NullLoginException("login is null");
        }

        if (user.getName().equals(login)){
            user = null;
        }
    }

    @Override
    public void registration(String login, String password) throws ServiceClientException {

        if(login == null || login.isEmpty()){
            throw new ServiceClientException("Incorrect login");
        }

        if(password == null || password.isEmpty()){
            throw new ServiceClientException("Incorrect password");
        }

        try{
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.registration(login, password);
        } catch (DAOUserException e) {
            throw new ServiceClientException(e);
        } catch (DAOCantCreateFileException e) {
            e.printStackTrace();
        } catch (DAOUserRegistrationException e) {
            e.printStackTrace();
        }

    }
}
