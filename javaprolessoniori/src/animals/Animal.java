package animals;

public class Animal {
    //        создати клас животние с три полями .
//        создати статиские и статик метод  .
//        создати  статистичкие блок иницилизациеи.
//        Вывасть вы кансоль сообщение при любои ининцилизациеи поля
    private static  Animal cow = new Animal("Корова",false,"black");
static {
    System.out.println();
    System.out.println( "статие блок инициалиция" +cow);
        cow =  new Animal("Бык",false,"black");
    System.out.println("статие блок инициалиция" + cow);
    System.out.println();
    }

    public static Animal getCow() {
        return cow;
    }

    private String type;

    private boolean isPredator;

    private  String color;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", isPredator=" + isPredator +
                ", color='" + color + '\'' +
                '}';
    }

    {
        System.out.println("блок инициалиция начяло до иниуиализация полей" +this);
        type ="lion";
        isPredator = true;
        color="yellow";
        System.out.println("блок инициалиция конец после иниуиализация полей" +this);
    }
    public Animal(String type, boolean isPredator, String color) {
        this.type = type;
        this.isPredator = isPredator;
        this.color = color;
        System.out.println("крнструктор   после иниуиализация полей"+this);
    }

    public String getType() {
        return type;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public String getColor() {
        return color;
    }
}
