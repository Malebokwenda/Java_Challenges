package IfStatement;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);

        if (length == width) {
            System.out.println("THIS IS A SQUARE");
        }

        input.close();
    }

}


