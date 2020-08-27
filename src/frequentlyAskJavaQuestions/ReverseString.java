package frequentlyAskJavaQuestions;

public class ReverseString {
    public static void main(String[]args) {

        // there is no reverse function available in String,
        // String is immutable Object
        // StringBuffer is mutable, is have reverse function.
        // we cant reverse string with already existing function

        //1 Without using already existing function
        String s = "Selenium";
        int length = s.length();
        String rev = "";            // to save rev String

        for(int i=length-1; i>=0; i--){
           rev=rev+ s.charAt(i);
        }
        System.out.println(rev);

        //2 using StringBuffer Class

        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());
    }
}
