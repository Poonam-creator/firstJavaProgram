package frequentlyAskJavaQuestions;

public class ReverseANumber {
    // for counting questions always use while loop
    public static void main(String args []){
        int num = 1234;
        int rev = 0;

        while (num != 0){
            int n = num%10;
            rev = rev * 10 +n;
            num= num/ 10;

        }
        System.out.println("reverse of number is :"+ rev);
    }
}
