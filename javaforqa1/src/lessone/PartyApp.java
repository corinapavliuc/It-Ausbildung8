package lessone;

public class PartyApp {

    public static void main(String[] args) {
        Man man = new Man();
        man.setName("Alex");
        man.printGreetings();

     Person person1=new Man();


        Women woman = new Women();
        woman.setName("Elena");
        woman.printGreetings();

        Child child = new Child();
        child.setName("Max");
        child.printGreetings();

        Junior junior=new Junior();
        junior.setName("Petr");

        Person[] people = {man, woman, child,junior};

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            person.printGreetings();
        }

    }
}


