package by.etc.tolstoy.service.transaction_type.impl;

import by.etc.tolstoy.bean.Count;
import by.etc.tolstoy.exception.service.transaction_type.IncomingTransactionException;
import by.etc.tolstoy.exception.NegativeMoneyException;
import by.etc.tolstoy.exception.NullCountException;
import by.etc.tolstoy.service.transaction_type.TransactionType;

/**
 * Created by Home on 21.01.2020.
 */
public class IncomingTransactionTypeImpl implements TransactionType {
    @Override
    public Count changeCount(Count count, double money) throws IncomingTransactionException {

        try {
            if (money < 0.0) {
                throw new NegativeMoneyException();
            }
            if (count == null) {
                throw new NullCountException();
            }
            count.setBalance(count.getBalance() + money);
            return count;
        } catch (NegativeMoneyException e ) {
            throw new IncomingTransactionException("negative money", e);
        } catch (NullCountException e ) {
            throw new IncomingTransactionException("count == null", e);
        }
    }
}
