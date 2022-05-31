package lab_03;

public class Lab3cham1 {
    public static void main(String[] args) {
        int[] intarray = {1,2,3,4,5};

        int sochan =0;
        int sole =0;
        for (int i = 0; i < intarray.length; i++) {
            if(intarray[i] %2==0) {
                sochan++;
            }else{
                sole++;

            }
        }
        System.out.println("The number of even number is: " +sochan);
        System.out.println("The number of odd number is: " +sole);

    }
}

