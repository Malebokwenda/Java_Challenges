package ifElseStatements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
//        ask for input
        System.out.println("Enter an operator: +, - , *, or /");
        operator = scanner.next().charAt(0);

//        user to enter number
        System.out.println("Enter your first number ");
        num1 = scanner.nextInt();

        System.out.println("Enter your second number");
        num2 = scanner.nextInt();

//        operator (num1, num2,operator);
        switchCalculator(num1,num2,operator);
        scanner.close();

    }
    public  static void operator (int num1, int num2, char result){
        int ans = 0;
        // addition
        if (result == '+') {
            ans = num1 + num2;
            // subtraction
        }
        else if (result == '-') {
            ans = num1 - num2;
            // multiplication
        }
        else if (result == '*') {
            ans = num1 * num2;
            // modulo
        }
        else if (result == '%') {
            ans = num1 % num2;
            // division
        }
        else if (result == '/') {
            ans = num1 / num2;
        }

        // printing the final result
        System.out.println("Your answer is " + ans);
//        return ans;
    }

    public static void switchCalculator(double number1, double number2,char operator){
//        System.out.println();
      double  result = 0;

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

    };

}



