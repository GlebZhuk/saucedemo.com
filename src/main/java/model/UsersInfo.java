package model;

public class UsersInfo {
    private String userFirstName = "Hleb";
    private String userLastName = "Zhuk";
    private String userZipCode = "3203";

    public UsersInfo(String userFirstName, String userLastName, String userZipCode) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userZipCode = userZipCode;
    }

    public UsersInfo() {
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserZipCode() {
        return userZipCode;
    }
}
