package frequentlyAskJavaQuestions;

public class FactorsOfANumber {
    // By which numbers given number gets divide
    // 10 --> 1 2 5 10
    // 60 --> 1, 2, 3, 4, 5,10,12, 15,20,30,60
    public static void main(String args []){
        int num =60;

        for(int i=1; i<=num; i++){

            if(num % i == 0){
                System.out.println(i+ " ");      // to print all the numbers
            }
        }
    }

}
