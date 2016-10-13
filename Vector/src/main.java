/**
 * Created by Василий on 02.10.2016.
 */
public class main {
    public static void main(String[] args) {

        Contact person = new Contact("Ivan","Ivanov","89123456789");
        //person.print();
        System.out.println(person.getName());
        System.out.println(person.getPhone());

        Contact petrov = new Contact("Petr", "Petrov", "16465484868");

        System.out.println(petrov.getName());


    }
}
