//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution6{
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        HashMap hashMap = new HashMap();

        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            hashMap.put(name,phone);

        }
        while(in.hasNext()){
            String s = in.next();
            if (hashMap.containsKey(s)) {
                System.out.println(s+"="+ hashMap.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}