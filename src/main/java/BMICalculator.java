/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("What is your height in inches? ");
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();

        System.out.println("What is your weight in pounds? ");
        input = new Scanner(System.in);
        float weight = input.nextFloat();

        float bmi = (weight / (height * height)) * (float) 703;

        System.out.printf("Your BMI is %.1f.\n", bmi);

        if (bmi <= 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        if (bmi > 18.5 & bmi < 25)
            System.out.println("You are within the ideal weight range.");
        if (bmi >= 25)
            System.out.println("You are overweight. You should see your doctor.");
    }
}
