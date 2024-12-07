public class Method3 {
    
    public static int uangsaku(String kota, int hari) {
        int tarifPerHari = 0;
        
        switch (kota.toUpperCase()) {
            case "A":
            tarifPerHari = 500000;
                break;
            case "B":
            tarifPerHari = 350000;
                break;
            case "C":
            tarifPerHari = 250000;
                break;
            default:
                System.out.println("Kelompok kota tidak valid");
                return 0;
        }

        return  tarifPerHari * hari;
    }

    public static void main(String[] args) {
        
        String kota1 = "A";
        int hari1 = 1;
        System.out.println( "A1 " + (uangsaku(kota1, hari1)));

        String kota2 = "B";
        int hari2 = 1;
        System.out.println( "B1 " + (uangsaku(kota2, hari2)));

        String kota3 = "C";
        int hari3 = 1;
        System.out.println("C1 " + (uangsaku(kota3, hari3)));

    }
}
