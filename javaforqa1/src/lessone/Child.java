package lessone;

public class Child extends Person{
    @Override
    public void printGreetings() {
        super.printGreetings();
        System.out.println("Hi,I am a child" + getName());
    }
}
