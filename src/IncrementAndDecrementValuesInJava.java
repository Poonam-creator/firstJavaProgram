public class IncrementAndDecrementValuesInJava {

    public static void main(String []args){

        int i= 1;
        int b= i++;  //Post increment,  increasing value of i after giving to b.

        System.out.println(i);
        System.out.println(b);


        int a=1;
        int c=++a; // pre increment, increasing value of a before giving to c.
        System.out.println(a);
        System.out.println(c);

        System.out.println("******************");

        int d=2;
        int e=d--; //Post decremental, decrease the value of d after giving to e;
        System.out.println(d);
        System.out.println(e);


        int f=2;
        int g=--f; // Pre decremental, decrease the value of f before giving to g.
        System.out.println(f);
        System.out.println(g);


    }
}
