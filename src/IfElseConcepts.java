public class IfElseConcepts {

    public static void main(String args[]){
        // write a logic to find a highest number

        int a=10;
        int b=20;
        int c=30;

        if(a>b){
            System.out.println("a is grater");
        }
        else if(b>c){
            System.out.println("b is grater");
        }
         else {
            System.out.println("c is grater");

        }
        //------------------------------------------------------------------------
         int a1=100;
         int b1=200;
         int c1=300;

         if(a1>b1 & a1>c1){ //false +false = false
             System.out.println("a1 is greatest");
         }
         else if(b1>c1){
             System.out.println("b1 is greatest");
         }
         else{
             System.out.println("c1 is greatest");
         }

            //--------------------------------------------------------------------
         int a2= 400;
         int b2 =00;
         int c2 =300;

         if(a2>b2 & a2>c2){ //true and true = true
             System.out.println("a2 is greater");
         }
        else if(b2>c2){
            System.out.println("b2 is greater");
         }
        else{
            System.out.println("c2 is greater");
         }

        //----------------------------------------------------------------------
        int a3=400;
        int b3=500;
        int c3=300;

        if(a3>b3 & a3>c3){   // false + true = false
            System.out.println("a3 is greater");
        }
        else if(b3>c3){
        System.out.println("b3 is greater");
        }
        else{
            System.out.println("c3 is greater");
        }
         // ==  <= => =!  comparision operators

        int d=40;
         int e= 40;
         if(d==e){
             System.out.println("d and e are equal");
         }
         else{
             System.out.println("d and e are not equal");
         }

    }
    }

