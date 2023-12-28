package task3;

public class Bicycle {
    private String model;

    private int whellSize;

    private String type;

    private int gears;

    private String color;

    public Bicycle(String model,
                   int whellSize,
                   String type,
                   int gears,
                   String color) {
        this.model = model;
        this.whellSize = whellSize;
        this.type = type;
        this.gears = gears;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", whellSize=" + whellSize +
                ", type='" + type + '\'' +
                ", gears=" + gears +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bicycle roodBike= new Bicycle("Road boke",29,"Read",1,"Red");
        Bicycle mountainBike =new Bicycle("Mountain Bike",28,"Mountain",3,"Blau");
        Bicycle kidsBike=new Bicycle("Kids",23,"Kid",2,"Yellow");

        Bicycle[] bicycles={roodBike,mountainBike,kidsBike};

        for (Bicycle bicycle : bicycles){
            System.out.println(bicycle);
        }

    }
}
