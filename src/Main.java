import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AContact email = new AContact("John", "John@gmail.com");
        email.contact();
        Phone number = new Phone("Jimin", "614-467-7869");
        number.contact();

    }
}

abstract class Contacts{
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    abstract public void contact();

}

class AContact extends Contacts{
    private String email;

    public AContact(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public String toString() {
        return "AContact{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public void contact() {
        System.out.println("Emailing "+email);
    }
}

class Phone extends Contacts{
    private String number;

    public Phone(String name, String number) {
        super(name);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                '}';
    }

    @Override
    public void contact() {
        System.out.println("Calling " + number);
    }
}