import java.util.Scanner;

public class Method6 {
    
    public static boolean cekSuara(int a) {
        boolean suaraJA = false;
        boolean suaraBE = false;
        boolean suaraCI = false;
        boolean suaraJE = false;
        boolean suaraLO = false;

        Scanner Input = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            String suara = Input.nextLine().toUpperCase();  
                switch (suara) {
                    case "JA":
                        suaraJA = true;
                        break;
                    case "BE":
                        suaraBE = true;
                        break;
                    case "CI":
                        suaraCI = true;
                        break;
                    case "JE":
                        suaraJE = true;
                        break;
                    case "LO":
                        suaraLO = true;
                        break;
                    default:
                        break;
                }
            }
        return suaraJA && suaraBE && suaraCI && suaraJE && suaraLO;
    }


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        Input.nextLine();

        boolean hasil = cekSuara(a);

        System.out.println(hasil);
    }
}
