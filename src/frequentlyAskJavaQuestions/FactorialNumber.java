package frequentlyAskJavaQuestions;

public class FactorialNumber {
    // Factorial means, if say what is factorial number of 5 (! factorial sign)
    // !5 = 5*4*3*2*1 =120
    // !4 = 4*3*2*1 =24
    // according to mathematics !0 =1
    public static void main(String [] args){

        int num =5;
        int fact =1;

        for(int i=1; i<=5; i++){
            fact = fact * i;
        }

        System.out.println("Factorial number of 5 is::" + fact);
        System.out.println("Factorial number of "+num+" is::"+ fact);

        getFactorial(4);

    }

    // we can create method also
    public static void getFactorial( int num) {
            int fact1=1;
        for(int i=1; i<=num; i++){
            fact1 = fact1* i;
        }
        System.out.println("factorial number of given "+num+" is::"+fact1);
    }

    }
