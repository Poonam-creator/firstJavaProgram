package oopsConcept2.methodOverriding.Inheritance;

public class Car1 extends Vehicle{

    public void start(){
        System.out.println("Car Start method");
    }
    public void stop(){
        System.out.println("Car Stop method");
    }
    public void refuel(){
        System.out.println("Car Refuel method");
    }
}