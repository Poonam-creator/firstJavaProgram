package frequentlyAskJavaQuestions;

public class ArmstrongNumber {
    // armstrong number is that
    //153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+ 125 + 27 = 153
    // 371 = 3*3*3 + 7*7*7 + 3*3*3 = 371

    public static void main(String []args){
        int num = 153;
        int actualNumber = num;
          double result =0;

        while(actualNumber != 0){
            int n = actualNumber%10;
            result =  (result+ Math.pow(n, 3));
            actualNumber = actualNumber/10;
        }

        if(result == num){
            System.out.println("is a armstrong number");
        }
        else {
            System.out.println("not a armstrong number");
        }
    }

}
