package OOPS2Jan13.Encapsulation;

public class BadExample {
    public static void main(String[] args) {
        VwoLogin vwoLogin = new VwoLogin("admin", "admin");
        boolean check = vwoLogin.isLoggedIn("admin", "password");
        vwoLogin.setUsername("admin");
        System.out.println(vwoLogin.getPassword());
        boolean check2 = vwoLogin.isLoggedIn("admin", "password");
        System.out.println(check2);
    }
}

class VwoLogin {
    private String username;
    private String password;

    public VwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("LoggedIn");
            return true;
        } else {
            System.out.println("Wrong");
            return false;
        }
    }
}