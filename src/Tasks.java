

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Tasks {
    public static void main(String[] args) {
        int[] arrayNumber;
        arrayNumber = new int[16];
        System.out.println(" ");

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = (int) (100 * Math.random());
            System.out.print(arrayNumber[i] + " ");

            i = arrayNumber[i];
            System.out.println(i);


            System.out.println(Integer.toBinaryString(i));
            System.out.println( i >> 1);
        }


    }

}





