public class RataRataArray {
    public static void main(String[] args) {

        // NAJWA AREEFA GHAISANI_103122400028 //
        
        int [] nilai = {70, 85, 90, 75, 80 } ;
        int total = 0;

        for (int  i = 0; i < nilai.length; i++) {
            total += nilai[i]; 

        } 

        double ratarata = (double) total / nilai.length; 
        System.out.println("Rata - rata nilai: " + ratarata);
        
    }
}
