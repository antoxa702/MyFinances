package by.etc.tolstoy.service.transaction_type.impl;

import by.etc.tolstoy.bean.Count;
import by.etc.tolstoy.exception.service.transaction_type.ExpenseTransactionException;
import by.etc.tolstoy.exception.NegativeMoneyException;
import by.etc.tolstoy.exception.NotEnoughMoneyOnCountException;
import by.etc.tolstoy.exception.NullCountException;
import by.etc.tolstoy.service.transaction_type.TransactionType;

/**
 * Created by Home on 21.01.2020.
 */
public class ExpenseTransactionTypeImpl implements TransactionType {
    @Override
    public Count changeCount(Count count, double money)throws ExpenseTransactionException {
        try {
            if (money < 0.0) {
                throw new NegativeMoneyException();
            }

            if (count == null) {
                throw new NullCountException();
            }

            if (count.getBalance() - money < 0.0) {
                throw new NotEnoughMoneyOnCountException();
            }

            count.setBalance(count.getBalance() - money);
            return count;

        } catch (NegativeMoneyException e ) {
            throw new ExpenseTransactionException("negative money", e);
        } catch (NullCountException e ) {
            throw new ExpenseTransactionException("count == null", e);
        } catch (NotEnoughMoneyOnCountException e) {
            throw new ExpenseTransactionException("not enough money on this count", e);
        }
    }
}
