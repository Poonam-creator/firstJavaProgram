import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class ArrayConceptInJava {
    public static void main(String args[]){
        //STATIC ARRAY
        // Array = to store similar data type values in array variable
        // lowest bound / index is 0
        // upper bound/ index n-1(n is size of index)
        // Dis- advantages of array 1.size is fixed, its called static array------to overcome this problem we use Collections Arraylist, hastable---Dynamic array
        //2.store similar data types only---- to overcome this problem we use object array

        int a[]= new int [4];

        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;

        System.out.println(a[2]);
        //System.out.println(a[4]);// it will give "Array Index out ob bound" Exception
        //------------------------------------------------------------------------------------

        // For printing all values from Array use for loop
        // we can not write i<=a.length because it will give 4th index and 4 index is not available

        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        //-------------------------------------------------------------------------------------

        //char array

        char c[]= new char[3];
        c[0]='a';
        c[1]='b';
        c[2]='d';
       // c[3]='v'; it will give exception "Array index out of bound"
        System.out.println(c[2]);

        //------------------------------------------------------------------------------------------

        //String array (String is not data type its class)

        String s[]= new String [2];
        s[0]="welcome";
        s[1]="java";
        System.out.println(s.length); // to get the size of array
        System.out.println(s[1]);

        // Object Array--- Object is Super class
        //object array is use to store different data type values
        Object  ob[]= new Object[6];
        ob[0]="tom";
        ob[1]="peter";
        ob[2]=25;
        ob[3]=19/6/2013;
        ob[4]="london";
        ob[5]='M';

        System.out.println(ob[4]);
        System.out.println(ob.length);

        // To Print all values of array
        for(int j=0; j<ob.length;j++){
            System.out.println(ob[j]);
        }



    }
}
