public class LoopsInJava {

    public static void main(String rgs[]){

        //While Loop
        // If we don't give incremental part/ decremental part, While loop will give infinite loop.



        int i=1;// initialization part
        while(i<=10){ // condition part
            System.out.println(i);
            i++;  // incremental part / decremental part
        }
        System.out.println("******************");

        //FOR LOOP

        for(int j=1; j<=10; j++){ // initialization, condition and incremental/decremental all in one line
            System.out.println(j);
        }

        for(int k=1; k<10; k++){ //It will give you 1to9 numbers
            System.out.println(k);

        }
        System.out.println("*************************");

        for(int l=10; l>=1; l--){ //It will print 10 to 1 numbers, reversing order
            System.out.println(l);
        }
        System.out.println("*************************");

        for(int h=10; h>=-10; h--){ //It will print 10 to -10
            System.out.println(h);
        }
    }
}
