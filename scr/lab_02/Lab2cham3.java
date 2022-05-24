package lab_02;

import java.util.Scanner;

public class Suggest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền chiều cao của bạn: ");
        int Height = scanner.nextInt();
        System.out.println("Điến số cân nặng của bạn: ");
        int Weight = scanner.nextInt();
        float Total = (float) Weight / (Height * 2);
        System.out.println("Chỉ số BMI của bạn là: " + Total);
        if (Total < 18.5) {
            System.out.println("Bạn đang thiếu cân, hãy ăn nhiều lên");
        } else if (Total >= 18.5 && Total <= 24.9) {
            System.out.println("Cân nặng bình thường, keep calm and carry on");
        } else if (Total >= 25 && Total <= 29.9) {
            System.out.println("Thừa cân, nên giảm ăn uống và có chế độ luyện tập tốt");
        } else {
            System.out.println("Béo phì, giảm cân gấp đi thôi");
        }
    }
}