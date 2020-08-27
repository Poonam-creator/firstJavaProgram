package frequentlyAskJavaQuestions;

public class PrimeNumber {
    // Prime number is number which is divisible only by itself or by 1,(7 only divisible by 1 and 7 and 9 number can be divisible by 1,3 and 9)

    public static void main(String args[]) {

        int no = 11;
        int temp = 0;
        // in this scenario we need to find is the number divisible any number except 1 and 10,
        // if it gets divisible by any other number then its not prime number.
        // so we need to start loop by 2 and till 9 so no-1 makes 9
        // in loop if no gets divisible by any number of i temp will become 1 it will indicate number is prime.

        for (int i = 2; i <= no-1; i++ ){
            if(no % i ==0)
            temp=temp+1;
        }
        if(temp>0){
            System.out.println("number is not Prime");
        }
        else {
            System.out.println("number is Prime");

        }

       }

}
