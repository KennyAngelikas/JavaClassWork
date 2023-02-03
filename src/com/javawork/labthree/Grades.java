package JavaClassWork.src.com.javawork.labthree;
// Kenneth Angelikas
// 2/2/23
// Grade Calculator
// This program accepts your homework and two exam scores as input and computes your grade in the course.

import java.util.Scanner;  // Importing Java Scanner to take user input

public class Grades {

    static int homework() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Homework Weight --> ");
        int hwWeight = myObj.nextInt();  // Read user input  // hwWeight

        System.out.println("Number of assignments --> ");
        int hwAssign = myObj.nextInt();  // Read user input  // hwAssign

        System.out.println("Average Homework grade --> ");
        int averageHw = myObj.nextInt();  // Read user input  // averageHw

        System.out.println("Number of late days used --> ");
        int ldHw = myObj.nextInt();  // Read user input  // ldHw

        System.out.println("Labs attended --> ");
        int lattendHw = myObj.nextInt();  // Read user input  // lattendHw

        int[] intArray = new int[]{hwWeight,hwAssign,averageHw,ldHw,lattendHw};

        return int[] intArray;
    }


    public static void main(String[] args) {  // Main function
        System.out.println("This program accepts your homework and two exam scores as input and computes your grade in the course.");
        System.out.println("First we will take your homework grades.");
        homework();

    }
}
