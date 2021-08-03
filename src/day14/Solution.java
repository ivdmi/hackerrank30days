package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Difference{
    private int[] elements;
    public int maximumDifference = 0;
    Difference(int[] elements){
        this.elements = elements;
    }
    public void computeDifference(){
        for (int i = 0; i<elements.length; i++){
            for (int j = i; j<elements.length; j++){
                int dif = Math.abs(elements[i]-elements[j]);
                if (maximumDifference < dif) {
                    maximumDifference = dif;
                }
            }
        }
        System.out.println(maximumDifference);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] elements = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Difference difference = new Difference(elements);
        difference.computeDifference();
    }
}