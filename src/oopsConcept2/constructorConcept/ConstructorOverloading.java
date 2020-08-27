package oopsConcept2.constructorConcept;

public class ConstructorOverloading {
    String name; // how to initialize global variable ---> create constructor and make local variable to global variable
    int age;

    public ConstructorOverloading(){
        System.out.println("default constructor");
    }

    public ConstructorOverloading(int a){
        System.out.println("one param constructor");
    }
    public ConstructorOverloading(int a, int b){
        int z= a+b;
        System.out.println(z);
        System.out.println("two params constructor");
    }
    public ConstructorOverloading(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("global variable constructor");
    }

    public static void main(String args []){
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj2 = new ConstructorOverloading(10,20);
        ConstructorOverloading obj3 = new ConstructorOverloading("Tom",25);
        System.out.println(obj3.name+" "+obj3.age);


    }
}
