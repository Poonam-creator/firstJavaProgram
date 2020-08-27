public class StaticAndNonStatic {
    // global variable will be available across the all functions with some conditions.
    String s =" tom"; // non static variable
    static int age = 25;// static variable

    public static void main(String args[]){
        //how to call static methods and variables
        sum();// direct calling
        StaticAndNonStatic.sum();// by class name
        System.out.println(age);
        System.out.println(StaticAndNonStatic.age);

        // how to call non static methods and variables
        // we need to create object
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendmail();
        System.out.println(obj.s);
    }
    public void sendmail(){//non static method
        System.out.println("sendmail method");
    }
    public static void sum(){// static method
        System.out.println("sum method");
    }
}
