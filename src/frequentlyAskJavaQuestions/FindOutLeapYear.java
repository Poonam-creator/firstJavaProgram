package frequentlyAskJavaQuestions;

public class FindOutLeapYear {
    public static void main(String args[]){
        // Leap year is divisible by 4, for century year which are ending with 00
        // 1900 is not a leap year bcause it is not divisible by 400
        //2012 is leap year but not century year
        // Century is a leap year only when its perfectly divisible by 400

        int year= 2020;
        boolean leap = false;
        if(year % 4==0){
            if(year % 100==0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            }
            else{
                leap = true;
            }
        }
        else{
            leap = false;
        }
        if(leap){
            System.out.println(year+"is leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
    }
}
