package day06;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(bufferedReader.readLine().trim());
        // ArrayList<Person> people = new ArrayList<Person>();
        for (int i=0; i<T; i++){
            String line = bufferedReader.readLine().trim();
            char[] charArray = line.toCharArray();
            for (int j=0; j<line.length(); j++) {
                if (j%2==0)
                System.out.print(charArray[j]);
            }
            System.out.print(" ");
            for (int j=0; j<line.length(); j++) {
                if (j%2!=0)
                    System.out.print(charArray[j]);
            }

            System.out.println();
        }
        bufferedReader.close();
    }
}