package model;

public class User {
    //private String name = "standard_user";
   //
    // private String password = "secret_sauce";
    //создает переменные в среде jenkins, но локально код не заработает
    //private String name =System.getenv("name");
    //private String password =System.getenv("password");
    private String name=System.getProperty("name");
    private String password=System.getProperty("password");
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
