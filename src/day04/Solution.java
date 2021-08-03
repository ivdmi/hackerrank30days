package day04;

import java.io.*;
import java.util.*;

class Person {
    int age;
    Person (int initialAge){
        if (initialAge < 0)
        {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else {
            this.age = initialAge;
        }
    }

    public void yearPasses(){
        age++;
    }

    public void amIOld(){
        if (age < 13){
            System.out.println("You are young.");
        } else {
            if (age >= 18){
                System.out.println("You are old.");
            } else {
                System.out.println("You are a teenager.");
            }
        }
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(bufferedReader.readLine().trim());
        // ArrayList<Person> people = new ArrayList<Person>();
        for (int i=0; i<T; i++){
            int age = Integer.parseInt(bufferedReader.readLine().trim());
            Person p = new Person(age);
            p.amIOld();
            p.yearPasses();
            p.yearPasses();
            p.yearPasses();
            p.amIOld();
            System.out.println();
        }
        bufferedReader.close();
    }
}