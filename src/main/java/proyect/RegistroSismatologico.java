package proyect;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class RegistroSismatologico {
    ArrayList<Sismo> registro = new ArrayList<Sismo>();
    public void agregarSismo(Sismo sismo) {
        registro.add(sismo);
    }
    public Sismo generarSismo(){
        // Clase Aleatorio de la rama rivas
        double magnitud = Aleatorio.devolverMagnitud();
        int dia = Aleatorio.devolverDia();
        int hora = Aleatorio.devolverHora();
        Sismo sismo = new Sismo(dia, hora, magnitud);
        return sismo;
    }
    public void llenarRegistro(int cantidadSismos){
        for(int i = 0; i < cantidadSismos; i++){
            Sismo sismo = generarSismo();
            agregarSismo(sismo);
        }
    }
    public Sismo sismoMasFuerte(){
        Sismo sismoMasFuerte = registro.get(0);
        for(Sismo sismo : registro){
            if(sismo.getMagnitud() > sismoMasFuerte.getMagnitud()){
                sismoMasFuerte = sismo;
            }
        }
        return sismoMasFuerte;
    }
    public int cantidadPorDiayMagnitud(int dia, double magnitud){
        int contador = 0;
        for(Sismo sismo : registro){
            if(sismo.getDia() == dia && sismo.getMagnitud() >= magnitud){
                contador++;
            }
        }
        return contador;
    }
    public void vaciarRegistro(){
        registro.clear();
    }
}
