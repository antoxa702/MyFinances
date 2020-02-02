package by.etc.tolstoy.service.transaction_type;

import by.etc.tolstoy.bean.Count;

/**
 * Created by Home on 21.01.2020.
 */
public interface TransactionType {
    public Count changeCount(Count count,  double money) throws Exception;
}


