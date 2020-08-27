package frequentlyAskJavaQuestions;

public class PositiveOrNegativeNumber {
    // number which is greater than 0 is positive and number which is lesser than 0 is negative.
    // number which is equal to 0 is 0.

    public static void main(String [] args){
        // insted of int use double cos it will handle both data types, int also and double also
        // we can store int in double.
        double number = 0;

        if(number > 0.00){
            System.out.println("number is positive");
        }
        else if(number < 0.00){
            System.out.println("number is Negative");
        }
        else {
            System.out.println("number is  zero");
        }

    }
}
