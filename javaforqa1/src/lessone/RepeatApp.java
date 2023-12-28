package lessone;

import org.w3c.dom.ls.LSOutput;

public class RepeatApp {
    public static void main(String[] args) {


        Person person = new Person();
        person.setName("Alex");

        Person personOne = new Person();
        personOne.setName("Oleg");
        System.out.println("Name= "+ person.getName());
        System.out.println(personOne);

    }
}
