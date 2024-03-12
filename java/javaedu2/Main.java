package javaedu2;

public class Main {
    public static void main(String[] args) {
        int qty = 20;
        double price = 5;
        double distance = 10;

        double deliveryFee = 0;
        if (distance <=4) {
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

        System.out.println("total cost: $" + totalCost);

    }
}