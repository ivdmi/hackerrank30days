package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        int xSquare = 4;
        int ySquare = 4;
        int sumMax = -1000;
     //   int [][] array = (int[][]) arr.toArray();

        for (int x = 0; x < xSquare; x++){
            for (int y = 0; y < ySquare; y++){
                int sum = arr.get(y).get(x) + arr.get(y).get(x+1) + arr.get(y).get(x+2) + arr.get(y+1).get(x+1) + arr.get(y+2).get(x) + arr.get(y+2).get(x+1) + arr.get(y+2).get(x+2);
             // int sum = array[x][y] + array[x+1][y] + array[x+2][y] + array[x+1][y+1] + array[x][y+2] + array[x+1][y+2] + array[x+2][y+2];
                if (sumMax < sum){
                    sumMax = sum;
                };
            }
        }
        System.out.println(sumMax);
        bufferedReader.close();
    }
}
