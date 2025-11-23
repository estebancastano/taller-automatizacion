package co.edu.udea.calidad.automatizacion.models;

public class Credentials {

    private String username;
    private String password;

    public Credentials() {}

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Credentials with(String username, String password) {
        return new Credentials(username, password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

