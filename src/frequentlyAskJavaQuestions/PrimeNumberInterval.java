package frequentlyAskJavaQuestions;

public class PrimeNumberInterval {
    // prime numbers between 20 to 50
    public static void main(String []args ) {

        int high = 50;
        int low = 20;

        while (low < high){
            boolean flag= false;
            for(int i =2; i<=low/2 ;i++){
                if(low % i== 0){
                    flag= true;
                    break;
                }
            }
            if(! flag){
                System.out.println(low +" ");
            }
            low++;
        }
    }
}
