package frequentlyAskJavaQuestions;

public class CountTheNumberOfDigits {
    // 1234 =4
    //1234456 =6
    public static void main(String [] args){
        int num  =1234535557;
        int counter =0;

        while(num != 0){
            num =num/10;
            counter++;
        }

        System.out.println("number of digit is :"+ counter);
    }

}


