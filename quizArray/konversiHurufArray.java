import java.util.Scanner;

public class konversiHurufArray {
    public static void main(String[] args) {
        

        char[] huruf = new char[180];
        Scanner input = new Scanner(System.in);

        inputHuruf(huruf, input);

        hurufKecil(huruf);

        cetakHuruf(huruf);

    }

    public static void inputHuruf(char[] A, Scanner input) {
        String inputString = input.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            A[i] = inputString.charAt(i);
        } 
        
    }

    public static void hurufKecil(char[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 'A' && A[i] <= 'Z') { 
                A[i] = (char) (A[i] + 32); 
            }
        }
    }


    public static void cetakHuruf(char[] A) {
        for (char c : A) {
            if (c != 0) {
                System.out.println(c);
            }
        }
        System.out.println();
    }
    
}



