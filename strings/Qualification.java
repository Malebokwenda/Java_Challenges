package strings;

import java.util.Scanner;

public class Qualification {
    public  static void  main(String args []){
        Scanner scanner =new Scanner(System.in);
        String qualification;
//        Ask what if user has BTech qualification
        System.out.println("Do you have a BTech qualification, Yes or No:");
        qualification = scanner.next();


        if(qualification == "yes"){
            System.out.println("You are appointed as a programmer and your salary is 15000");
        }
        else{
            System.out.println("No Luck!");
        }
    }
}
