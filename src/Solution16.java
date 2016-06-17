import java.io.*;
import java.util.*;
public class Solution16 {

    Stack<String> stack = new Stack<String>();
    Queue<String> queue = new LinkedList<String>();

    void pushCharacter(char ch) {
        stack.push(String.valueOf(ch));
    }

    void enqueueCharacter(char ch) {
        queue.add(String.valueOf(ch));
    }

    char popCharacter() {
        String character = stack.pop();
        return character.charAt(0);
    }

    char dequeueCharacter() {
        String character = queue.poll();
        return character.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution16 p = new Solution16();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

