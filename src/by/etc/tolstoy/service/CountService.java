package by.etc.tolstoy.service;

import by.etc.tolstoy.bean.TransactionSingleton;
import by.etc.tolstoy.service.exception.ServiceCountException;


public interface CountService {
    void addCount(String count, String balance) throws ServiceCountException;
    void addTransaction(String countName, String type, String money) throws ServiceCountException;
}
