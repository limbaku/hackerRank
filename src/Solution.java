import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int in = 0;
        double dou = 0.0;
        String st = null;

        /* Read and save an integer, double, and String to your variables.*/
        in = Integer.parseInt(scan.nextLine());
        dou = Double.parseDouble(scan.nextLine());
        st = scan.nextLine();


        /* Print the sum of both integer variables on a new line. */
        System.out.println(i +in);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + dou);

        /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */
        System.out.println(s+st);

        scan.close();

    }
}
