package day25;

import java.io.*;
import java.util.*;

public class Solution {

    static String isPrime(int n) {
        String res = "Prime";

        if (n==1){
            return "Not prime";
        }

        if (n==2){
            return res;
        }

        if (n%2==0){
            return "Not prime";
        }

        for (int i = 3; i<n; i=i+2){
            if (n%i == 0){
                res = "Not prime";
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            System.out.println(isPrime(n));
        }
    }
}