import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String... args){

float[] ages= {2.5F, 2.5F, 2.7F, 2.2F, 5.2F};
char age[]=new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(ages[i]);

        }
        int a = 5;
        while (a<10){
            System.out.println(a);
            a++;
        }
      int array2D[][]= new int[2][3];
        array2D[1][1] = 2;
        array2D[0][2] = 3;
        System.out.println(Arrays.toString((ages)));
        System.out.println(Arrays.deepToString(array2D));
    }

}