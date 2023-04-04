package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main( String args[]){
        System.out.println("Enter your letter garde:");
        Scanner scanner = new Scanner(System.in);
         String grade = scanner.next();

         String message;
         switch (grade){
             case "A":
                 message ="Excellent job!";
                 break;
             case "B":
                 message = "Great job!";
             case "C":
                 message = "Good job!";
                 break;
             case "D":
                 message = "You need to work a bit hard";
                 break;
             case "F":
                 message = "uh Oh";
                 break;
             default:
                 message ="Error. Invalid grade";
                 break;
         }
        System.out.println(message);

    }
}
