package frequentlyAskJavaQuestions;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
        // create calculator
    public static void main(String []args){

        Scanner reader = new Scanner(System.in);

        System.out.println("please enter two numbers :");
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.println("please select the operators : (+ , -, *, /)");
        char operator = reader.next().charAt(0);

        double result = 0;

        switch (operator){
            case '+' :
                result= first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            default:
                System.out.println("please enter correct operator");
                break;
        }
        System.out.println(result);
        }
}
