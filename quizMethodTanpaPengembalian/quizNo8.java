package quizMethodTanpaPengembalian;


import java.util.Scanner;

public class quizNo8 {
    static void secMax(int[] maxs, int[] secondMax ) {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int numb;

        Scanner input = new Scanner(System.in);
        System.out.println("input bilangan (0 untuk berhenti) : ");

        while (true) {
            numb = input.nextInt();
            if (numb == 0) {
                break;
            } 
            
            if (numb > max) {
                max2 = max;
                max = numb;
            } else if (numb > max2 && numb < max) {
                max2 = numb;
            }
        }

        maxs[0] = max;
        secondMax[0] = max2;

        System.out.println("bilangan terbesar kedua : " + secondMax[0]);

    }

    public static void main(String[] args) {
        int[] maxs = new int[1];
        int[] secondMax = new int[1];

        secMax(maxs, secondMax);
    }


}
