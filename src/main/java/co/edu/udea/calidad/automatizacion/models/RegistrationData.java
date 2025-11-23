package co.edu.udea.calidad.automatizacion.models;

public class RegistrationData {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    private String firstName;
    private String lastName;
    private String phone;

    private String country;
    private String city;
    private String address;
    private String state;
    private String postalCode;

    public RegistrationData() {}

    public RegistrationData(String username, String email, String password, String confirmPassword,
                            String firstName, String lastName, String phone,
                            String country, String city, String address, String state, String postalCode) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;

        this.country = country;
        this.city = city;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
    }

    public static RegistrationData create(String username, String email, String password, String confirmPassword,
                                          String firstName, String lastName, String phone,
                                          String country, String city, String address, String state, String postalCode) {

        return new RegistrationData(
                username, email, password, confirmPassword,
                firstName, lastName, phone,
                country, city, address, state, postalCode
        );
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getConfirmPassword() { return confirmPassword; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }

    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getAddress() { return address; }
    public String getState() { return state; }
    public String getPostalCode() { return postalCode; }
}
