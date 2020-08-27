package frequentlyAskJavaQuestions;

public class PowerOfNumberConcept {
    // 3 to the power 4means
    // 3^4 =3*3*3*3= 81         3 is a base and 4 is exponent

    public static void main(String args[]){
         int base = 3;
         int exponent = 4;

        long result = 1;

        while( exponent != 0){
             result*=base;      // result will be multiply my base
             --exponent;        // we need to keep decreasing exponent value to break the loop
         }

         System.out.println( result);

         // we can use predefine method also
       // System.out.println(Math.pow(base, exponent));

        // for loop
       }
}