package strings;

import java.util.Scanner;

public class Gender {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String gender;
//        Ask for gender they are
        System.out.println("what is your gender, Male or Female?");
        gender = scanner.next();


        if(gender == "male"){
            System.out.println("He is a Gentleman");
        }
        else{
            System.out.println("She is a beautiful woman");
        }


    }
}
