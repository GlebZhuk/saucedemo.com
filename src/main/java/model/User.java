package model;

public class User {
    private String name = "standard_user";
    private String password = "secret_sauce";

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
