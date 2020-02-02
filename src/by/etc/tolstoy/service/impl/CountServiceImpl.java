package by.etc.tolstoy.service.impl;

import by.etc.tolstoy.bean.TransactionSingleton;
import by.etc.tolstoy.dao.*;
import by.etc.tolstoy.dao.exception.*;
import by.etc.tolstoy.dao.factory.DAOFactory;
import by.etc.tolstoy.service.CountService;
import by.etc.tolstoy.service.exception.ServiceCountException;


/**
 * Created by Home on 20.01.2020.
 */
public class CountServiceImpl implements CountService {

    @Override
    public void addCount(String countName, String balance) throws ServiceCountException {
        // проверяем параметры
        if(countName == null || countName.isEmpty()){
            throw new ServiceCountException("count is null or empty");
        }

        if(balance == null || balance.isEmpty()){
            throw new ServiceCountException("balance is null or empty");
        }

        try{
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            CountDAO countDAO= daoObjectFactory.getCountDAO();
            countDAO.addCount(countName, balance);
        } catch (DAOCountException e) {
            throw new ServiceCountException(e);
        } catch (DAOCantCreateFileException e) {
            throw new ServiceCountException(e);
        } catch (DAOCountAddCountException e) {
            throw new ServiceCountException(e);
        }
    }

    @Override
    public void addTransaction(String countName, String type, String money) throws ServiceCountException {
        if (countName == null || countName.isEmpty()) {
            throw new ServiceCountException("count is null or empty");
        }

        if (money == null || money.isEmpty()) {
            throw new ServiceCountException("money is null or empty");
        }

        if (type == null || type.isEmpty()) {
            throw new ServiceCountException("type is unknown");
        }

        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            CountDAO countDAO = daoObjectFactory.getCountDAO();
            countDAO.addTransaction(countName, type, money);
        } catch (DAOCountException e) {
            throw new ServiceCountException(e);
        } catch (DAOCantCreateFileException e) {
            throw new ServiceCountException(e);
        } catch (DAOCountAddTransactionException e) {
            throw new ServiceCountException(e);
        } catch (DAOFileNotFoundException e) {
            throw new ServiceCountException(e);
        }
    }

}
