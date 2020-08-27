package frequentlyAskJavaQuestions;

public class SwapTwoValues {

    public static void main(String args[]){
        // 1.using third variable
        int a=10;
        int b=20;

        System.out.println("before swapping the values a is:"+a);
        System.out.println("before swapping the values b is:"+b);

        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("after swapping the values a is :"+ a);
        System.out.println("after swapping the values b is :"+ b);

        // 2. without third variable

        int d=40;
        int e=50;

        System.out.println("after swapping the values d is :"+ d);
        System.out.println("after swapping the values e is :"+ e);

        d=d-e; // 40-50 = -10
        e=d+e; // -10+50=40
        d=e-d; //40+-10=50

        System.out.println("after swapping the value of d is:"+d);
        System.out.println("after swapping the value of e is:"+e);


    }
}
