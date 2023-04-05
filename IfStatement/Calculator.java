package IfStatement;

import java.util.Scanner;
 public class Calculator {
     public static void main(String args[]){

         char operator;
         double number1, number2, result;

         Scanner input = new Scanner(System.in);

//         ask for operator
         System.out.println("Enter an operator: +, - , * ,or /");
         operator = input.next().charAt(0);

//        user to enter number
         System.out.println("Enter first number:");
         number1 = input.nextDouble();

//        second number
         System.out.println("Enter second number:");
         number2 = input.nextDouble();

         switch ( operator){

//              addition
             case '+':
                 result = number1 + number2 ;
                 System.out.println(number1 + " + "+ number2 + " = "+ result);
                 break;

//                 subtraction
             case '-':
                 result = number1 - number2;
                 System.out.println(number1 + " - " + number2  +  " = " + result);
                 break;

//                 multiplication

             case '*':
                 result = number1 * number2;
                 System.out.println(number1 + " * " + number2 + " = " + result);
                 break;

//                 Division

             case '/':
                 result = number1 / number2;
                 System.out.println(number1 + " / " + number2 + " = " + result);
                 break;

             default:
                 System.out.println("Error; Invalid Operator");
                 break;

         }
         input.close();

     }
}






