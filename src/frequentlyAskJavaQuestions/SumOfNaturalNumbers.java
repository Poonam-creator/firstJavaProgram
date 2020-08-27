package frequentlyAskJavaQuestions;

public class SumOfNaturalNumbers {

    // sum of natural numbers means 1+2+3+4+5.......+100
    public static void main(String [] args){
    int num =100;
    int sum= 0;
    int sum1=0;

    for(int i =0; i<= num; i++){
        sum = sum +i;
    }

    System.out.println(sum);

    // while loop
        int k=1;
        while(k<=num){
            sum1=sum1+k;
            k++;
        }
        System.out.println(sum1);
}}
