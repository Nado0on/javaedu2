package javaedu2;

import java.util.Scanner; // Import Scanner class

public class Main {
    public static void main(String[] args) {
        int qty = 50;
        double price = 25;
        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter delivery distance: ");
        double distance = scanner.nextDouble(); // Read the distance value from user input

        double deliveryFee = 0;
        if (distance <= 4) {
            deliveryFee = 2;
        } else if (distance <= 15) {
            deliveryFee = 5;
        } else if (distance <= 25) {
            deliveryFee = 10;
        } else if (distance <= 50) {
            deliveryFee = 15;
        } else {
            deliveryFee = 20;
        }

        double totalCost = (qty * price) + deliveryFee;

        System.out.println("Total cost: $" + totalCost);
        scanner.close(); // Close the scanner
    }
}