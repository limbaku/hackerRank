import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int numTimes=Integer.parseInt(scanner.next());

        for (int i=0;i<numTimes;i++) {
            String string = scanner.next();

            String oddCharacters="";
            String evenCharacter="";
            for(int j=0;j<string.length();j++) {

                if (j%2==0) {
                    oddCharacters = oddCharacters + string.charAt(j);
                }
                else
                    evenCharacter = evenCharacter + string.charAt(j);
            }

            System.out.println(oddCharacters + "  " + evenCharacter);

        }

        scanner.close();

    }
}
