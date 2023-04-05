package ifElseStatements;

import java.util.Scanner;

public class TotalFees {
    public static void main (String args[]){
//        char It_course;
//        int hostel_It =1000;
//        int  lab_It = 500;
//        int tuition_It =10000;
//
//        char computer_science ;
//        int  lab_science = 600;
//        int tuition_science = 10500;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter course for enrollment : IT or Computer Science");
//        int course = scanner.nextInt();
//        scanner.close();
//
//        int total;
//        if(course == It_course ){
//            total = hostel_It+ lab_It + tuition_It;
//            System.out.println("Your total fees is R"+ total);
//        }
//         else if ( course == computer_science){
//            total = lab_science + tuition_science;
//            System.out.println("Your total fee is R " + total);
//        }
//        else
//        {
//            System.out.println("Invalid choice");
//        }


                // Input the course code
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course code (100 for IT, 101 for Computer Science): ");
        int courseCode = input.nextInt();

        // Calculate the fees based on the course code
        double hostelFees = 0;
        double labFees = 0;
        double tuitionFees = 0;
        if (courseCode == 100) {
            hostelFees = 1000;
            labFees = 500;
            tuitionFees = 10000;
        } else if (courseCode == 101) {
            hostelFees = 0;
            labFees = 600;
            tuitionFees = 10500;
        } else {
            System.out.println("Invalid course code");
            System.exit(0);
        }

        // Calculate the total fees and display the result
        double totalFees = hostelFees + labFees + tuitionFees;
        System.out.println("Total fees: R" + totalFees);
            }

        }



