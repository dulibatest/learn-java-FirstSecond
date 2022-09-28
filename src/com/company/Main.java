package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 4
       float meters = 5.0f;
       float inches = meters * 39.37f;
        System.out.println("Inches: " + inches);
        System.out.println("Meters: " + inches/39.37f);
        System.out.println(" ");

        //Task 5
        float kilometres = 6.0f;
        double miles = 1.609 * kilometres;
        System.out.println("Miles: " + miles);
        System.out.println("Kilometres: " + miles / 1.609);
        System.out.println(" ");

        //Task 6
        double kilograms = 7;
        double pounds = kilograms * 2.2046;
        System.out.println("Pounds: " + pounds);
        System.out.println("Kilograms: " + pounds / 2.2046);
        System.out.println(" ");

        //Task 7
        double KmHr = 60;
        double MiHr = KmHr * 0.6214;
        System.out.println("Miles for hour: " + MiHr);
        System.out.println("Kilimetrs fot hour: " + MiHr / 0.6214);
        System.out.println(" ");

        //Task 8
        int test = 10;
        int mark = 8;
        int result = mark * 100 / test;
        System.out.println("Result: " + result + "%");
        System.out.println(" ");

        //Task 9
        int ageHusband = 46;
        int ageWife = 45;
        boolean age = true;
        if (ageHusband < 35 && ageWife < 35)
            age = true;
        else age = false;
        System.out.println(age);
        System.out.println(" ");

        //Task 10
        int income = 500000;
        boolean familyIncome = true;
        if (income > 20000 & income < 50000)
            familyIncome = true;
        else
            familyIncome = false;
        System.out.println(familyIncome);
        System.out.println(" ");

        //Task 11
        char appleSort1 = 'F';
        char appleSort2 = 'S';
        boolean is = true;
        if (appleSort1 == 'S' || appleSort2 == 'T')
            is = true;
        else
            is = false;
        System.out.println(is);
        System.out.println(" ");


        }


    }

