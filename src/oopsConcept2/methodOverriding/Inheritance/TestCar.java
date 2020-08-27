package oopsConcept2.methodOverriding.Inheritance;

public class TestCar {
    // when same method is present parent class as well as in child class, with same name same argument,child class method will be
    // + called, child class method will overtake parent class method its called METHODOVERRIDING.
    public static void main(String args[]){
        Bmw obj = new Bmw();
        obj.start();// child class method will be called
        obj.stop(); // parent class method will be called
        obj.engine();// grand parents method will be called
        obj.refuel(); // parent class method will be called
        obj.theftSafety(); // child class method will be called

        System.out.println("**************");
        Car1 car1 = new Car1();
        car1.start();
        car1.stop();
        car1.refuel();
        car1.engine();// parent class method

        System.out.println("**************");

        Car1 c1 = new Bmw(); // dynamic Polymorphism ---> parent class reference use to refer child class object.
        c1.engine();
        c1.start(); // only overridden method will called
        c1.stop();
        c1.refuel();

    }

}
