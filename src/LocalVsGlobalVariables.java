public class LocalVsGlobalVariables {
    //Global variable, to access them we need to create the object
    String name = "tom";
    int age = 25;
    public static void main(String args[]){
        int i =10; // local variable
        System.out.println(i);
        LocalVsGlobalVariables obj= new LocalVsGlobalVariables();
        obj.sum();
        System.out.println(obj.age);
    }
    public void sum(){
        // local variables
        int i = 10;
        int j= 20;
        int age =25;
    }
}
