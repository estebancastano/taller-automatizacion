package co.edu.udea.calidad.automatizacion.models;

public class User {
    private final String username;
    private final String password;
    private final String email;
    private final String firstName;
    private final String lastName;

    public User(String username, String password) {
        this(username, password, "", "", "");
    }

    public User(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String username() { return username; }
    public String password() { return password; }
    public String email() { return email; }
    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
}

