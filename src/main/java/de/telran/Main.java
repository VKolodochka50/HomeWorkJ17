package de.telran;

import java.util.Scanner;

public class Main {
   // static int defaultInt = 345;

    public static void main(String[] args) {
        System.out.println("Please enter any 3 digit positive integer: ");
        Scanner scan = new Scanner(System.in);
        int defaultInt = scan.nextInt();


        System.out.println("Your numbers is :" +defaultInt);
        System.out.println("Which means : " + countFirstInt(defaultInt) + ", " + countMidInt(defaultInt) + ", " + countLastInt(defaultInt));

    }

    static int countFirstInt (int myInt) {
             return myInt / 100;
        }
    static int countMidInt (int myInt)       {
    return myInt / 10 % 10;
    }
    static int countLastInt (int myInt) {
        return myInt % 10;
    }

}

//Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5