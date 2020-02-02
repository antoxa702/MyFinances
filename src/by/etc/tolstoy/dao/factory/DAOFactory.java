package by.etc.tolstoy.dao.factory;

import by.etc.tolstoy.dao.CountDAO;
import by.etc.tolstoy.dao.UserDAO;
import by.etc.tolstoy.dao.impl.TXTCountDAO;
import by.etc.tolstoy.dao.impl.TXTUserDAO;

/**
 * Created by Home on 20.01.2020.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final CountDAO txtCountImpl = new TXTCountDAO() ;
    private final UserDAO txtUserImpl = new TXTUserDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public CountDAO getCountDAO(){
        return txtCountImpl;
    }

    public UserDAO getUserDAO(){
        return txtUserImpl;
    }
}
