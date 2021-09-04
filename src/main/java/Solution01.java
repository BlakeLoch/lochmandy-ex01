/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class Solution01 {
    /*
        Print "What is your name?"
        'name' = read string from user
        'greeting' = "Hello, "+'name'+", nice to meet you!"
        Print 'greeting'
     */

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.println(greeting);
    }
}
