package OOP.Constructors;

import java.util.Scanner;

public class ConstructMain {

    public static void main(String[] args) {




        // initializing an object using a constructor
        Car toyota = new Car("Avanza", "Grey", 5);
        toyota.displayCarState();

        // call the method passengers
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the name of the first passenger: ");
        String passenger1 = input.nextLine();

        System.out.print("\nEnter the name of the second passneger: ");
        String passenger2 = input.nextLine();

        displayPassengers(passenger1, passenger2);


    }

    // using methods ... accept two user names in the method and display their name
    // a method must be declared outside the main method

    public static void displayPassengers(String name1, String name2){
        System.out.println("\nThe passengers are "+name1+ " and "+name2);
    }
}
