package day13;

import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    String author;
    int price;
    abstract void display();
}

class MyBook extends Book{
    MyBook(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String title = bufferedReader.readLine().trim();
        String author = bufferedReader.readLine().trim();
        int price = Integer.parseInt(bufferedReader.readLine().trim());

        MyBook book = new MyBook(title, author, price);
        book.display();
    }
}