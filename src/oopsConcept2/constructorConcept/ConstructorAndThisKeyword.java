package oopsConcept2.constructorConcept;

public class ConstructorAndThisKeyword {
    String name;
    int modNumber;
    int price;
    String engine;

    public ConstructorAndThisKeyword(String name , int modNumber , int price , String engine){
        this.name = name; // class variables = local variables
        this.modNumber = modNumber;
        this.price = price;
        this.engine = engine;
    }

    public static void main(String args []){
        ConstructorAndThisKeyword obj = new ConstructorAndThisKeyword("BMW" , 320 , 10,"Automatic");
        ConstructorAndThisKeyword obj1 = new ConstructorAndThisKeyword("Audi" , 8, 20,"Automatic");
        ConstructorAndThisKeyword obj2 = new ConstructorAndThisKeyword("Honda" , 200 , 15 ,"Manual");

        System.out.println(obj2.name+" "+obj2.modNumber+" "+obj2.price+" "+obj2.engine);
    }
}
