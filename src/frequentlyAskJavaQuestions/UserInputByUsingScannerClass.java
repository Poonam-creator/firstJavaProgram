package frequentlyAskJavaQuestions;

import java.util.Scanner;

public class UserInputByUsingScannerClass {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name");
        String name = scan.next();
        System.out.println("enter gender");
        char gender= scan.next().charAt(0);
        System.out.println("enter age");
        int age= scan.nextInt();
        System.out.println("enter mobile number");
        long mobnum= scan.nextLong();

        //To print all the values
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

    }


}
