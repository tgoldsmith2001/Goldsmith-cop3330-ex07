/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double factor=0.09290304;
        System.out.print("What is the length of the room in feet? ");
        String Str1=input.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String Str2=input.nextLine();
        double l= Double.parseDouble(Str1);
        double w= Double.parseDouble(Str2);
        double area_feet=l*w;
        double area_meters=area_feet*factor;
        System.out.format("The area is \n%.0f square feet\n%.3f square meters",area_feet,area_meters);
    }
}