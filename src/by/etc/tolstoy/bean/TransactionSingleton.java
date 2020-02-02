package by.etc.tolstoy.bean;

import by.etc.tolstoy.service.transaction_type.TransactionType;

import java.io.Serializable;

/**
 * Created by Home on 21.01.2020.
 */
public class TransactionSingleton implements Serializable{
    public static final TransactionSingleton instance = new TransactionSingleton();
    public static TransactionSingleton getInstance() {
        return instance;
    }
    double money;
    TransactionType transactionType;

    private TransactionSingleton() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionSingleton that = (TransactionSingleton) o;

        if (Double.compare(that.money, money) != 0) return false;
        return transactionType != null ? transactionType.equals(that.transactionType) : that.transactionType == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(money);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TransactionSingleton: " + "money = " + money + ", transactionType = " + transactionType;
    }
}
