package day17;

import java.io.*;
import java.util.*;

class Calculator {
    int power(int n, int p) throws Exception {
        if (n<0 || p<0){
             throw new Exception("n and p should be non-negative");
        }
        else {
            return (int) Math.pow(n, p);
        }
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++){
            int[] elements = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            try {
                Calculator calc = new Calculator();
                System.out.println(calc.power(elements[0], elements[1]));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}