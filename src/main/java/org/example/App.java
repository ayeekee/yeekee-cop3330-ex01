package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print( "What is your name? " );
        String name = se.nextLine();

        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.println(greeting);
    }
}
