package frequentlyAskJavaQuestions;

public class CharactorIsAlphabetorNot {
    public  static void main(String [] args){
        char ch= '£';

        if((ch >='a' && ch<='z') || (ch >='A' && ch <='Z')){
            System.out.println("char is Alphabet");
        }
        else if(ch >='0' && ch <='9') {
            System.out.println("char is number");
        }
        else{
            System.out.println("char is special ");
        }
    }
}
