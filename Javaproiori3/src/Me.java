import parents.Father;

public class Me extends Father {
    private String hobby;

    public Me(String name, String job, String hobby) {
        super(name, job);
        this.hobby = hobby;
        System.out.println(meHello+""+job+name+hobby);
    }

    public String getHobby() {
        return hobby;
    }

    public static String getMeHello() {
        return meHello;
    }

    private static String meHello= "I am myself";
    static {
        System.out.println(meHello);
    }
}
