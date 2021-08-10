package day20;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.Collections.swap;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());



        List<Integer> intList = (List<Integer>) Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

//        List<Integer> intList = new ArrayList<Integer>();

//        for(int item:list){
//            try {
//                intList.add(Integer.parseInt(item.trim()));
//            }
//            catch (Exception e)
//            {}
//
//        }

//        n = intList.size();

        // Write your code here

        int numSwaps = 0;
        boolean isSwaps = false;

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (intList.get(j) > intList.get(j + 1)) {
                    swap(intList, j, j + 1);
                    numberOfSwaps++;
                    numSwaps++;
            ///        isSwaps = true;
                }

             //   if (isSwaps) {numSwaps++;}
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + intList.get(0));
        System.out.println("Last Element: " + intList.get(n-1));
        bufferedReader.close();
    }
}