package oopsConcept2.interfaceConcept;

public class TestBank {

    public static void main(String args[]){
    HSBCBank hsbcBank = new HSBCBank();
    hsbcBank.credit();
    hsbcBank.debit();
    hsbcBank.transferMoney();
    hsbcBank.loan();
    hsbcBank.mutualFund();
    System.out.println(USBank.MIN_BAL);

    USBank usBank = new HSBCBank(); // only overridden methods will be called
    usBank.credit();
    usBank.debit();
    usBank.transferMoney();
}}
