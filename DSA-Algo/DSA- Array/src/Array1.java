import java.lang.reflect.Array;


import java.util.*;

public class Array1 {
    public static void main(String[] args) {




        int arr[] = {5, 7, 8, 3, 4};
        Arrays.sort(arr);

        for (int value : arr) {
            System.out.print(value + " ");

        }


        System.out.println();
        int a = arr[arr.length - 1];
        System.out.println(" Max Char - " + a);


        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (temp < arr[i]) {
                temp = arr[i];

            }

        }
        System.out.println(temp);
    }
}
