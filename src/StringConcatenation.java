public class StringConcatenation {

    public static void main(String args[]){
        int a = 10;
        int b =20;

        String x = "Hello";
        String y = "World";

        double c= 11.33;
        double d = 12.33;

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b); //execution start with left to right HelloWorld1020
        System.out.println(x+y+(a+b)); //HelloWorld30
        System.out.println(a+b+x+y+a+b); //30HelloWorld1020
        System.out.println(a+b+x+y+(a+b)); //30HelloWorld30
        System.out.println(c+d);
        System.out.println(x+y+c+d);//HelloWorld11.3312.33
        System.out.println("value of a is"+a);
        System.out.println("the addition of a and b is :"+(a+b));
    }
}
