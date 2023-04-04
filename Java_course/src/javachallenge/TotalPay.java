package javachallenge;

import java.util.Scanner;

public class TotalPay {
    public static void main(String args[]){
        int hourlyPay  = 20;
        int  overTime = 25;
        int hours = 40;

//        get values for the unknown
        System.out.println("How many hours did the employee work this week ?");
        Scanner scanner = new Scanner(System.in);
        int workedHours = scanner.nextInt();
        scanner.close();


        if (hourlyPay <= hours){

            hourlyPay = hourlyPay * hours;
        }
        System.out.println(hourlyPay);


//        quick detour for the bonus earners
        if  (workedHours > hours){
            hourlyPay = hourlyPay + overTime;

        }
//        ouput
        System.out.println(" The employee's  total pay is R" + hourlyPay);
    }
}


