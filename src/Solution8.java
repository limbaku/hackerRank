import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String result = Integer.toString(n,2);
        int numOfOnes =0;
        int max=numOfOnes;

        for(int i=0;i<result.length();i++) {
            if (result.charAt(i) == '1') {
                numOfOnes ++;
            }
            else {

                numOfOnes=0;

            }
            if (numOfOnes > max)
                max=numOfOnes;
        }

        System.out.println(max);
    }
}
