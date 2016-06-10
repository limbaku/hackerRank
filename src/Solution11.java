import  java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void Difference(int[] elements) {
        this.elements=elements;
    }

    public int computeDifference() {
        int difference=0;
        maximumDifference=difference;
        for (int i=0; i< elements.length;i++) {

            for(int j=i+1;j<elements.length;j++) {
                difference = Math.abs(elements[i]-elements[j]);
                if (difference > maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }

        return maximumDifference;
    }
}

public class Solution11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}