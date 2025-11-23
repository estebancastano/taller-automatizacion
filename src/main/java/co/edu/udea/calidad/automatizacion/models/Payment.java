package co.edu.udea.calidad.automatizacion.models;

public class Payment {

    private String cardNumber;
    private String cvv;
    private String cardholderName;
    private String expirationMonth;
    private String expirationYear;

    public Payment() {}

    public Payment(String cardNumber, String cvv, String cardholderName,
                   String expirationMonth, String expirationYear) {

        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardholderName = cardholderName;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public static Payment with(String cardNumber, String cvv, String cardholderName,
                               String expirationMonth, String expirationYear) {

        return new Payment(cardNumber, cvv, cardholderName, expirationMonth, expirationYear);
    }

    public String getCardNumber() { return cardNumber; }
    public String getCvv() { return cvv; }
    public String getCardholderName() { return cardholderName; }
    public String getExpirationMonth() { return expirationMonth; }
    public String getExpirationYear() { return expirationYear; }
}
