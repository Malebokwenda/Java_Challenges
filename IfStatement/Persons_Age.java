package IfStatement;

import java.util.Scanner;

public class Persons_Age {

    public static void main(String args[]) {
        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age<=15){
            System.out.println("Children");
        } else if (age<= 30) {
            System.out.println("Youth");

        }
        else
            System.out.println("Senior Citizen");

    }

}
