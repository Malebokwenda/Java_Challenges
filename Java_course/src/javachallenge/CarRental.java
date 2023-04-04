package javachallenge;

import java.util.Scanner;

public class CarRental {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int carSize;
        int numberOfDays;
        double DailyFee = 0  , totalCost;



//        Ask for car size
        System.out.println("What car size would you like to rent. Type answer as  Small, Medium, Large:");

        System.out.println("Enter 1 to rent a small car for R200");
        System.out.println("Enter 2 to rent a medium car  for R260");
        System.out.println("Enter 3 to rent a Large car for R350");
         carSize = scanner.nextInt();

        System.out.println("How many days do you want to rent the car");
        numberOfDays = scanner.nextInt();


        if (carSize == 1)
            DailyFee= 200;
        else if(carSize == 2)
            DailyFee=(int)260;
        else if(carSize == 3)
            DailyFee=(int)350;


        totalCost = DailyFee * numberOfDays;

        System.out.println("The total charges after renting the car is R" + totalCost);



//        Ask for car size
                System.out.println("What car size would you like to rent. Type answer as  Small, Medium, Large:");

                System.out.println("Enter 1 to rent a small car for R200");
                System.out.println("Enter 2 to rent a medium car  for R260");
                System.out.println("Enter 3 to rent a Large car for R350");
                carSize = scanner.nextInt();

                System.out.println("How many days do you want to rent the car");
                numberOfDays = scanner.nextInt();


                if (carSize == 1){
                    totalCost = 200 * numberOfDays;
                }

                else if(carSize == 2){
                    totalCost = 260 * numberOfDays;
                }
                else if(carSize == 3){
                    totalCost = 350 * numberOfDays;
                }

                System.out.println("The total charges after renting the car is R" + totalCost);

            }
        }




