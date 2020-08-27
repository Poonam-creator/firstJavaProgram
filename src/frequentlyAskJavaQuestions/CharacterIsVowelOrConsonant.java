package frequentlyAskJavaQuestions;

import java.util.Scanner;

public class CharacterIsVowelOrConsonant {
    public static void main(String args[]){

        // vowels are a,e,i,o,u
        // 1**** by using given character
       // char ch= 'a';

        // 2****using scanner class
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter character");
        char ch= scan.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch =='u'){
            System.out.println("ch is vowel");
        }
        else{
            System.out.println("char is consonant");
        }

        // 3**** using switch statement

        char ch1= 'd';
        switch (ch1) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println("char  is vowel");
                break;
            default:
                System.out.println("char is consonant");

        }
    }
}
