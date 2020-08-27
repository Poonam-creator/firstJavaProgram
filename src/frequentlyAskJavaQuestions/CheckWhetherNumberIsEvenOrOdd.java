package frequentlyAskJavaQuestions;

import java.util.Scanner;

public class CheckWhetherNumberIsEvenOrOdd {
    public static void main(String args[]){
        // 1. already given number
        int a=101;

        if(a%2==0){
           System.out.println("a is even number");
        }
        else{
            System.out.println("a is odd number");
        }

        // user given number, user enter number in consol box, we need to se Scanner class

        Scanner reader= new Scanner(System.in);

        System.out.println("Please enter number");

        int num = reader.nextInt(); // we will save this in num variable

        if(num%2==0){
            System.out.println("enterd number is Even");
        }
        else{
            System.out.println("entersed number is Odd");
        }



    }
}
