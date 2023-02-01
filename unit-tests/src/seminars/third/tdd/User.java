package seminars.third.tdd;

public class User {
    String login;
    String password;

    public boolean authMethod(String loginUser, String passwordUser) {
        if (login.equals(loginUser) && password.equals((passwordUser))) {
            return true;
        } else return false;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
