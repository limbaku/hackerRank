
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution18 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            bubbleSort(a);
        }

        public static void bubbleSort(int[] intArray) {

            int numberOfSwaps = 0;
            int swap;
            for (int i = 0; i < intArray.length; i++) {


                for (int j = 0; j < intArray.length - 1; j++) {
                    if (intArray[j] > intArray[j + 1]) {
                        swap=intArray[j];
                        intArray[j]=intArray[j + 1];
                        intArray[j+1]=swap;
                        numberOfSwaps++;
                    }
                }

                if (numberOfSwaps == 0) {
                    break;
                }
            }

            System.out.println("Array is sorted in " + numberOfSwaps + " swaps");
            System.out.println("First element: " + intArray[0]);
            System.out.println("Last element: " + intArray[intArray.length-1]);


        }
}
