package javachallenge;

import java.util.Scanner;

public class IfElseStatement {
    public  static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the your number:");
        number = scanner.nextInt();

        if (number>100){
            System.out.println("Above 100");
        }
        else{
            System.out.println("Below 100");
        }


    }
}
