package proyect;
import java.util.Random;

public class Aleatorio {
    
    public static double devolverTerremoto(){
        Random random = new Random();
        return random.nextDouble() * 9.5;
    }

    public static int devolverHora(){
        Random random = new Random();
        return random.nextInt() * 23;
    }

    public static int devolverDia(){
        Random random = new Random();
        return random.nextInt() * 29;
    }
    
}
