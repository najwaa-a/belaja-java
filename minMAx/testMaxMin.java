import java.util.Scanner;

public class testMaxMin {

    //NAJWA AREEFA GHAISANI_103122400028//
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);


        int[] data = new int[8]; 

        System.out.println("Data Array: " );
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        int min = data[0];
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
        }

        
        System.out.println("Nilai Maximum: " + max);
        System.out.println("Nilai Minimum: " + min);

    }
}
