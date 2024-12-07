import java.util.Scanner;

public class Method2 {
    public static boolean prima(int a) {
    if (a == 1) {
        return false;
    }    
    
    for (int i = 2; i < a ; i++) {
        if (a % i == 0) {
            return false;
        }
        return true;

    }
        return false;
}
public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int bilangan = Input.nextInt();
    
    boolean hasil = prima(bilangan);    
    System.out.println(bilangan + " adalah "+ hasil);


}
}