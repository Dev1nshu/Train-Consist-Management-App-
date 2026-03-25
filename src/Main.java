import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Custom Bogie Class to represent a train car with properties.
 */
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(name + " Bogie -> Capacity: " + capacity);
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC7 - Sort Custom Objects (Comparator) ");
        System.out.println("==========================================\n");

        // Use a List to hold custom Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // Add instances of Bogie to the list
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Sort the list based on the capacity attribute using Comparator
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Bogies Sorted by Capacity (Ascending):");
        System.out.println("--------------------------------------");

        // Iterate and display the sorted bogies
        for (Bogie b : bogieList) {
            b.display();
        }

        System.out.println("\nUC7 sorting completed successfully...");
    }
}