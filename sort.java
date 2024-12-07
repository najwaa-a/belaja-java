public class sort {

    //NAJWA AREEFA GHAISANI_103122400028//
        public static void main(String[] args) {
            String a = "hello world";
            char[] b = a.toCharArray(); 
            String c = "";

            for (int i = 0; i < b.length; i++) {
                
                if (b[i] != ' ') {
                    c += String.valueOf(b[i]);
                }
    
               
                for (int j = i + 1; j < b.length; j++) {
                    if (b[i] == b[j] && b[i] != ' ') {
                        
                        c += String.valueOf(b[j]);
                        b[j] = ' '; 
                    }
                }
                
            }
                System.out.println(c);
        }
    
}
