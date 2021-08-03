package day18;

import java.io.*;
import java.util.*;

public class Solution {
    static Stack<Character> stack = new Stack<>();
    static Queue<Character> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        for (int i = 0; i < s.length(); i++) {
            pushCharacter(s.charAt(i));
            enqueueCharacter(s.charAt(i));
        }

        boolean isPalindrome = true;


        for (int i = 0; i < queue.size(); i++) {
            char chQueue = popCharacter();
            char chStack = dequeueCharacter();
            if (chQueue != chStack){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "The word, " + s + ", is a palindrome." : "The word, " + s + ", is not a palindrome.");

    }

    static void pushCharacter(char ch){
        stack.push(ch);
    }

    static void enqueueCharacter(char ch){
        queue.add(ch);
    }

    static char popCharacter() {
        return stack.pop();
    }

    static char dequeueCharacter(){
        return queue.poll();
    }
}