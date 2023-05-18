import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, AutoBase> map = new HashMap<>();
        map.put(new Car(7687, 9675), new AutoBase(1999, "BMW", 700_900, "black"));
        map.put(new Car(7687, 9675), new AutoBase(1999, "AUDI", 888_000, "black"));
        map.put(new Car(7687, 9675), new AutoBase(1999, "Ford", 900_000, "black"));
        map.put(new Car(7687, 9675), new AutoBase(1999, "Kia", 500_000, "black"));
        map.put(new Car(7687, 9675), new AutoBase(1999, "Honda", 309_000, "black"));

        map.entrySet().forEach(System.out::println);
    }
}