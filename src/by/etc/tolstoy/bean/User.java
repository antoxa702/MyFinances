package by.etc.tolstoy.bean;

import by.etc.tolstoy.exception.NullCountException;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 20.01.2020.
 */
public class User implements Serializable {
    private String name;
    private String password;
    Set<Count> counts;

    public User() {
        counts = new HashSet<>();
    }

    public User(String name, String password) {
        this();
        this.name = name;
        this.password = password;
    }

    public Set<Count> getCounts() {
        return counts;
    }

    public void setCounts(Set<Count> counts) {
        this.counts = counts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        return counts != null ? counts.equals(user.counts) : user.counts == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (counts != null ? counts.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        StringBuilder stringCounts = new StringBuilder("\n");
        for (Count count : counts) {
            stringCounts.append(count.toString());
        }

        return "User :" +
                " name = " + name + ", password = " + password  + "\ncounts :" + stringCounts;
    }

    public boolean addCount(Count count) throws NullCountException {
        if (count == null) {
            throw new NullCountException("count == null");
        }
        counts.add(count);
        return true;
    }
}
