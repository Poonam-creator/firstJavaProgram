package frequentlyAskJavaQuestions;

public class NumberIsPrimeOrNot {
    // prime number is number only can divisible by 1 ot itself
    // 2 is lowest prime number
    public static void main(String args[]){
        int num= 13;
        boolean flag= false;

        for(int i= 2; i<= num-1 ; i++){
            if( num% i == 0){
                flag = true;
            }
        }
        if(! flag){
            System.out.println(num +" is prime");
        }
        else {
            System.out.println(num + "not a prime number");
        }
       }
}
