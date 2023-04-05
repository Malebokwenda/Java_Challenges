package orOperator;

import java.util.Scanner;

public class NoodlesPrices {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

//             user to enter the flavor of noodles they want to buy
            System.out.println("Welcome to Pick and Pay! Please enter the flavor of noodles you would like to purchase:");
            String flavor = input.nextLine();

//             price of the noodles based on the flavor entered
            double price;
            if (flavor == "chicken" || flavor == "beef") {
                price = 3.50;
            } else if (flavor == "biltong" || flavor == "crispy chicken") {
                price = 2.50;
            } else {
                System.out.println("We're sorry, that flavor is not available. Please try again.");
                return;
            }

            // Display the price of the noodles to the user
            System.out.printf("The price of the %s noodles is R%.2f. Thank you for shopping with us!", flavor, price);
        }
    }

