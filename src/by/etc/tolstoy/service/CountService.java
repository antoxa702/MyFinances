package by.etc.tolstoy.service;

import by.etc.tolstoy.exception.service.ServiceCountException;


public interface CountService {
    void addCount(String count, String balance) throws ServiceCountException;
    void addTransaction(String countName, String type, String money) throws ServiceCountException;
}
