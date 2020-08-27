package oopsConcept2.interfaceConcept;

public class HSBCBank implements USBank , BrazilBank { // multiple Inheritance

    @Override
    public void credit() {
        System.out.println("HSBC Credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC Debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("HSBC TransferMoney");
    }

    public void loan(){
        System.out.println("HSBC Loan");
    }

    @Override
    public void mutualFund() {
        System.out.println("Hsbc Mutual funds");
    }
}
