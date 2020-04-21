package app.model;

import java.util.Objects;

public class User {

    private String name;

    private String password;

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

    public User(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        int result = name!=null ? name.hashCode() : 0;
        result = 47*result+(password!=null ? password.hashCode() : 0);
        return result;
    }
}
