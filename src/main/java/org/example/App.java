package org.example;
import java.util.Date;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is your current age? " );
        String age = sc.nextLine();
        System.out.print( "At what age would you like to retire? ");
        String retire = sc.nextLine();
        int convertedage = Integer.parseInt(age);
        int convertedretire = Integer.parseInt(retire);
        int yearsleft = convertedretire - convertedage;
        Date d = new Date();
        int years = d.getYear();
        int currentyear = years + 1900;
        int retiredyear = currentyear + yearsleft;
        System.out.println(" You have "+ yearsleft + " years left until you can retire.");
        System.out.println(" It's " +currentyear + ", so you can retire in " + retiredyear +".");

    }
}
