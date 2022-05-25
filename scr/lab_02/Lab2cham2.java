package lab_02;

import java.util.Scanner;

public class Lab2cham2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy điền con số mà cưng thích nhất nào, babe: ");

        int so = scanner.nextInt();
        if(so % 2 == 0){
            System.out.println("Chuẩn số chẵn rồi nhé");
        }else{
            System.out.println("Chuẩn số lẻ rồi nhé");
        }
    }
}
