package oopsConcept2;

public class MethodsInJava {
    // starting point of execution
    // main method is void because we never write return statement inside main method.
    public static void main(String args[]){

        MethodsInJava obj = new MethodsInJava();
        obj.test();
        int r =obj.pqr();
        System.out.println(r);

        String s1 = obj.qa();
        System.out.println(s1);

        int div = obj.division(10,2);
        System.out.println(div);
    }
    //non static Methods //if you want to call non static methods you have to create object.
    // void does not return any value
    public void test()// no input no output
    {
        System.out.println("test method");
    }

    public int pqr()//no input some output
    {
        System.out.println("pqr method");
        int a=10;
        int b =20;
        int c = a+b;
        return c;
    }
    public String qa()// no input some output
    {
        System.out.println("qa method");
        String s ="selenium";
        return s;
    }
    //x and y--- input parameter/arguments
    public int division(int x, int y) //some input some output
    {
        System.out.println("div method");
        int d= x/y;
        return d;
    }

}
