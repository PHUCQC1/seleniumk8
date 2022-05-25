package lab_02;

import java.util.Scanner;

public class lab2cham1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Điền chiều cao của bạn: ");
        float Height = scanner.nextFloat();
            System.out.println("Điền số cân nặng của bạn: ");
        float Weight = scanner.nextFloat();
        float Total = (float) Weight / (Height * 2);
            System.out.println("Chỉ số BMI của bạn là: " + Total);
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