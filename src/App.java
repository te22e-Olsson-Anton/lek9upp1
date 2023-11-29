public class App {

    
    static double omkretsCirkel( double radie )
    {
        double omkrets = 2 * 3.14 * radie;
        return omkrets;
    }
    static void ritaLinje(int längd) {
        for (int i = 0; i < längd; i++) {
            System.out.print("-");
        }
        System.out.println(); 
    }
    static void ritaRektangel(int höjd, int bredd) {
        for (int i = 0; i < höjd; i++) {
            for (int j = 0; j < bredd; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    
    public static void main(String[] args) 
    {
        double radie = 5.0;
        double resultat = omkretsCirkel(radie);
        System.out.println("Omkretsen av cirkeln med radie " + radie + " är: " + resultat);

        
        ritaLinje(10); 
        ritaLinje(23); 

        ritaRektangel(20, 8);

        

            static char tecken(double tal) {
                if (tal < 0) {
                    return '-';
                } else {
                    return '+';
                }
            }
        
            public static void main(String[] args) {
                double tal1 = -3.232;
                double tal2 = 5.232;
        
                char resultat1 = tecken(tal1);
                char resultat2 = tecken(tal2);
        
                System.out.println("Tecknet för " + tal1 + " är: " + resultat1);
                System.out.println("Tecknet för " + tal2 + " är: " + resultat2);
            }
        

            static boolean siffra(char tecken) {
                
                return Character.isDigit(tecken);


                char tecken1 = 'a';
            char tecken2 = '4';

             boolean resultat1 = siffra(tecken1);
             boolean resultat2 = siffra(tecken2);

             System.out.println(tecken1 + " är en siffra: " + resultat1);
             System.out.println(tecken2 + " är en siffra: " + resultat2);
        
    }

}
