package day12;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Person{
    String firstName;
    String lastName;
    int idNumber;

    Person(){
    }

    Person(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
}

class Student extends Person{
    List<Integer> scores;

    Student(String firstName, String lastName, int idNumber, List<Integer> scores){
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    char calculate(){
        char grade = 'T';
        float avr = 0;
        for (int i = 0; i < scores.size(); i++) {
            avr = avr + scores.get(i);
        }
        avr = avr/scores.size();

        if (avr <= 100 && avr >= 90){
            grade = 'O';
        } else {
            if (avr >=80) {
                grade = 'E';
            } else {
                if (avr >=70) {
                    grade = 'A';
                } else {
                    if (avr >= 55){
                        grade = 'P';
                    } else {
                        if (avr >= 40) {
                            grade = 'D';
                        }
                    }
                }
            }
        }
        return grade;
    }

    void getInfo(){
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
        System.out.println("Grade: " + calculate());
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> people = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Student student = new Student(people.get(0), people.get(1), Integer.parseInt(people.get(2)), scores);
        student.getInfo();
    }
}