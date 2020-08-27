package frequentlyAskJavaQuestions;

public class FibonacciSeries {
    // fibonacci means keep adding the number to previous number
    // 0+1+1+2+3+5+8+13+21+34.....
    public static void main(String []args){
        int num =10;
        int t1= 0;
        int t2 =1;

        for(int i=0; i<=num ; i++ ){

            System.out.println(t1);
            int sum =t1+t2;
            t1 =t2;
            t2 = sum;
        }
    }
}
