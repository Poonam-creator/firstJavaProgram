package oopsConcept2;

public class Car {
    int mod;
    int wheel;
    public static void  main(String args[]){
        //obj is object reference
        // new Car(); is object
        //new keyword is use to create object.
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.mod =2001;
        a.wheel =4;

        b.mod =2002;
        b.wheel=4;


        System.out.println("before shifting the references");

        System.out.println(a.mod);
        System.out.println(a.wheel);

        System.out.println(b.mod);
        System.out.println(b.wheel);

        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("after shifting the references");
            a=b;
            b=c;
            c=a;

            a.mod =10;
            System.out.println(a.mod);//10
            c.mod = 20;
            System.out.println(a.mod);//20
    }
}
