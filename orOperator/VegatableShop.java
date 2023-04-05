package orOperator;

import java.util.Scanner;

public class VegatableShop {
    public static void main(String args[]) {
        String vegetables;
        double quantity;
        double totalPrice;
        double pricePerKg ;

        Scanner scanner = new Scanner(System.in);
        
//        ask which veggies they are buying
        System.out.print("Enter the vegetable you want to purchase: ");
        vegetables = scanner.next();

        System.out.print("Enter the quantity in Kg: ");
         quantity = scanner.nextDouble();

        if (vegetables == "potato" || vegetables == "carrot") {
             pricePerKg = 25;
        }
        else if (vegetables == "cabbage"|| vegetables == "beans") {
            pricePerKg = 30;
        }

        totalPrice = pricePerKg * quantity;
        System.out.println("The total amount you have to pay for " + quantity + " Kg of " + vegetables + " is R." + totalPrice);
    }
}






