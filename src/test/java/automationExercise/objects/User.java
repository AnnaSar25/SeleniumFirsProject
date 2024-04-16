package automationExercise.objects;

public class User {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    private String password;
    private String email;



}
