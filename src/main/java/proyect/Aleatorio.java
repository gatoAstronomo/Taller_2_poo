package proyect;
import java.util.Random;

public class Aleatorio {
    public static double devolverMagnitud(){
        Random random = new Random();
        return random.nextDouble() * 9.5;
    }

    public static int devolverHora(){
        Random random = new Random();
        return (int)random.nextDouble() * 23;
    }

    public static int devolverDia(int n){
        Random random = new Random();
        return random.nextInt(n - 1) + 2;
    }
    
}
