package co.edu.udea.calidad.automatizacion.models;

public class User {
    private final String username;
    private final String password;
    private final String email;
    private final boolean agreeTerms;

    // Constructor principal
    public User(String username, String password, String email, boolean agreeTerms) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.agreeTerms = agreeTerms;
    }

    // Getters
    public String username() { return username; }
    public String password() { return password; }
    public String email() { return email; }
    public boolean agreeTerms() { return agreeTerms; }
}
