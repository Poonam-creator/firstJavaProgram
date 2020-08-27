package frequentlyAskJavaQuestions;

public class PalindromeNumber {
    // palindrome number is that even we reverse its the same 121

    public static void main(String args[]){

        int num =1331;
        int rev= 0;

        int actualnum =num;

        while( num != 0){
            int n= num% 10;
            rev= rev*10+n;
            num = num/10;
        }

        System.out.println(rev);

        if (actualnum == num){
            System.out.println(actualnum +"is a palindrome number");
        }
        else{
            System.out.println(actualnum + " is a not palindrome number");
        }
    }
}
