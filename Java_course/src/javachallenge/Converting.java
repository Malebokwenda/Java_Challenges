package javachallenge;

import java.util.Scanner;

public class Converting {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

//        Ask input from user between 0 and 1
        System.out.println("Enter 0 to covert to US Dollars or 1 to convert to British pounds:");
        int choice = scanner.nextInt();

//        ASk for the rands to be converted
        System.out.println("Enter the amount in rands");
        double rands = scanner.nextDouble();

        double result;

        if(choice == 0) {
            result = rands / 6;
            System.out.println(rands + " Rands is equal to " + result + " US Dollars");

        }
        else if (choice == 1) { result = rands / 12;
                System.out.println(rands + " Rands is equal to " + result + " British Pounds.");
        }
        else {
            System.out.println("Invalid choice");
        };
        scanner.close();





    }
}
