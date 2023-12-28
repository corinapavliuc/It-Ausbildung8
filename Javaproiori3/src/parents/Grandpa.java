package parents;

public class Grandpa {
    private String name;
    private static String hello = "I am Grandpa";

    static{
        System.out.println(hello);
    }
    public Grandpa(String name) {
        this.name = name;
        System.out.println(
                hello + " " + name
        );
    }

    public String getName() {
        return name;
    }

    public static String getHello() {
        return hello;
    }
}
