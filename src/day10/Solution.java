package day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        StringBuilder sbBin = new StringBuilder();
        String sBin = "";

        int remainder = 0;

        while (n>0) {
            remainder = n%2;
            n=n/2;
            sbBin.append(remainder);
            sBin = remainder + sBin;
        }

        char[] charArray = sBin.toCharArray();
        int maxSecuence = 1;
        int k = 1;

        for (int i = 1; i < charArray.length; i++){
            if (charArray[i] == charArray[i-1]){
                k++;
            }
            else {
                if (k > maxSecuence){
                    maxSecuence = k;
                }
                k = 1;
            }
            if (k > maxSecuence){
                maxSecuence = k;
            }
        }
        System.out.println(maxSecuence);
        bufferedReader.close();
    }
}
