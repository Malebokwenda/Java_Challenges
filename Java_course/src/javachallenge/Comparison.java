package javachallenge;

import java.util.Scanner;

public class Comparison {
    public static void main(String args[]){




        int num1 , num2, numbers;
//        numbers = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
//        ask for first number
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();

//        second number
        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();


        if(num1 > num2){
            System.out.println("Number 1 is greater than number 2");
        }


    }
}
