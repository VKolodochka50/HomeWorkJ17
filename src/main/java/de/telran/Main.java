package de.telran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();
        int defaultInt = 345;

        if (userInt == 0 ) {
            System.out.println("You are not provided a value, app will evaluate default value" + defaultInt);
           return;
        }

        int evalLastInt = defaultInt % 10;
        int evalMidInt = defaultInt / 10 % 10;
        int evalFirstInt = defaultInt / 100;


        System.out.println("Hello world!");
    }
}