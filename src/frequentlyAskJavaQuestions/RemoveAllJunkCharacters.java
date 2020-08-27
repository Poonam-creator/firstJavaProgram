package frequentlyAskJavaQuestions;

public class RemoveAllJunkCharacters  {

    public static void main(String args[]){

        // we need to use Regular Expression (a-z,A-Z,0-9) and ^ this sign

        String s= "$$$%$Q£% 123456";
        s.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s);

        String s1="$@$@$@$@$@ Java";
        s1.replaceAll("^a-zA-z0-9","");
        System.out.println(s1);
        // not working need to find out
    }

}
