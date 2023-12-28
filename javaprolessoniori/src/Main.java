import animals.Animal;

public class Main {
    public static void main(String[] args) {
//        создати клас животние с три полями .
//        создати статиские и статик метод  .
//        создати  статистичкие блок иницилизациеи.
//        Вывасть вы кансоль сообщение при любои ининцилизациеи поля
        Animal.getCow();
        Animal rino = new Animal("rino",false,"grey");
        System.out.println();
        Animal parrot = new Animal("parrot",false,"colorful");
    }
}
