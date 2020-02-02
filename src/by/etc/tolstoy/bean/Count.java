package by.etc.tolstoy.bean;

import java.io.Serializable;

/**
 * Created by Home on 21.01.2020.
 */
public class Count implements Serializable{
    public final String countName;
    double balance;

    public Count() {
        countName = "default_name";
    }

    public Count(String countName, double balance) {
        this.countName = countName;
        this.balance = balance;
    }

    public String getCountName() {
        return countName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Count count = (Count) o;

        if (Double.compare(count.balance, balance) != 0) return false;
        return countName != null ? countName.equals(count.countName) : count.countName == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = countName != null ? countName.hashCode() : 0;
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "{Count  - " + " countName = " + countName +", balance = " + balance + "}\n" ;
    }
}
