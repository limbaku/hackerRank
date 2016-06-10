import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.next());

        int result = factorial(number);

        System.out.println(result);

    }

    public static int factorial(int n) {
        if (n==1) {
            return n*1;
        }

        else {

            return n* factorial(n - 1);
        }

    }
}