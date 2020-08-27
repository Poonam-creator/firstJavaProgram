package oopsConcept2;

public class MethodOverloading {
    // we can not create method inside the method
    // we can not create duplicate methods
    // methods are independent to each other
    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(20,40);
        obj.sum("tom");
    }
    //when method name is same with different input parameter or arguments and different data types
    // + within the same class its called method over loading.
    public void sum(){
        System.out.println("zero parameter");
    }
    public void sum(String k){
        System.out.println("one parameter");
        System.out.println(k);
    }
    public void sum(int q){
        System.out.println("method with one parameter");
        System.out.println(q);
    }
    public void sum(int a, int b){
        System.out.println("method with two parameter");
        System.out.println(a+b );
    }
}
