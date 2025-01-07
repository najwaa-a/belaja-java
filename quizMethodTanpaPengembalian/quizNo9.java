package quizMethodTanpaPengembalian;

public class quizNo9 {
    public static void faktor(int n) {
        for (int i = 1; i <= n; i++) {
            boolean iniFaktor = (n % i == 0);
            System.out.println(i + " " + iniFaktor); 
        }
    }

    public static void main(String[] args) {
        faktor(5);
    }
}
