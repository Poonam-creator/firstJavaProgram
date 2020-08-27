package oopsConcept2.interfaceConcept;

// only Abstract methods allowed in interface, no method body allowed. only declaration of method.only prototype.
// we can not create object of Interface. we can not instantiate interface
// Rules and regulation in form of methods
// we can declare variable in interface and variables are static by default. value of variable will not  be change its final.
// since java 8 we can have static , default and private methods in interface
// no main method inside of interface.
// to make relation between class and interface we need to use implements keyword.
// any class implementing interface we need to define all interface methods.
public interface USBank {

    int MIN_BAL = 100;// final/constant  in nature
    public void credit();

    public void debit();

    public void transferMoney();
}
