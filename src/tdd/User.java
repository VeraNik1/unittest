package tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;
    private boolean logged;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.logged = false;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }
    public String getName() {
        return name;
    }
    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean status) {

        this.logged = status;
    }
}