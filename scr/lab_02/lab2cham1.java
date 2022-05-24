package lab_02;

import com.sun.jdi.FloatType;

import java.util.Scanner;

public class lab2phay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Height: ");
        int Height = scanner.nextInt();
        System.out.println("Please input Weight: ");
        int Weight = scanner.nextInt();
        float Total = (float) Weight / (Height * 2);
        System.out.println("BMI: " + Total);
        if (Total < 18.5) {
            System.out.println("Underweight");
        } else if (Total >= 18.5 && Total <= 24.9) {
            System.out.println("Normal weight");
        } else if (Total >= 25 && Total <= 29.9) {
            System.out.println("Overweigth");
        } else {
            System.out.println("Obesity");
        }
    }
}