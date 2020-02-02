package by.etc.tolstoy.dao;

import by.etc.tolstoy.exception.dao.*;

/**
 * Created by Home on 20.01.2020.
 */
public interface CountDAO {
    void addCount(String countName, String balance) throws DAOCountException, DAOCantCreateFileException, DAOCountAddCountException;
    void addTransaction(String countName, String type, String money) throws DAOCountException, DAOCantCreateFileException, DAOCountAddTransactionException, DAOFileNotFoundException;

}
