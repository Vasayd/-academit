import java.util.Locale;

/**
 * Created by Василий on 09.10.2016.
 */
public class Contact {
    private String name;
    private String surname;
    private String phone;

    public Contact(String name, String surname, String phone) {

        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print() {
       // System.out.print("%s %s %s",name, surname, phone);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(phone);
    }
}
