package lessone;

public class Junior extends Person{


    @Override
    public void printGreetings() {
        super.printGreetings();
        System.out.println("Hi,I am a Junior" + getName());

    }

}
