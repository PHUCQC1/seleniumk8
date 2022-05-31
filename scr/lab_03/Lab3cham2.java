package lab_03;

public class Lab3cham2 {
    public static void main(String[] args) {
        int[] intarray = {1, 2, 3, 4, 5};

        int max = intarray[0];
        int min = intarray[0];
        for (int i = 0; i < intarray.length; i++) {
            if (intarray[i] < min) {
                min = intarray[i];
            } else if (intarray[i] > max) {
                max = intarray[i];
            }
        }
        System.out.println("The minimum number is: " +min);
        System.out.println("The max number is: " +max);
    }

}