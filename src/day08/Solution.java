package day08;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<String, String>();
        int n = Integer.parseInt(scan.nextLine().trim());
        for (int i = 0; i < n; i++){
            String line = scan.nextLine().trim();
            String[] tokens = line.split(" ");
            if (tokens[0].isEmpty()){
                break;
            }
            if (tokens.length==1) {
                phoneBook.put(tokens[0], "");
            }
            else {
                phoneBook.put(tokens[0], tokens[1]);
            }
        }

        for (int i = 0; i < n && scan.hasNext(); i++){
            String s = scan.next();
            if(phoneBook.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }

        // while(scan.hasNext()){
        //     String s = scan.next();
        //     if(phoneBook.get(s) == null)
        //         System.out.println("Not found");
        //     else {
        //         System.out.println(s + "=" + phoneBook.get(s));
        //     }
        // }

        scan.close();
    }
}