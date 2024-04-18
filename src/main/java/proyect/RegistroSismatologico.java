package proyect;

import java.util.ArrayList;

public class RegistroSismatologico {
    ArrayList<Sismo> registro = new ArrayList<Sismo>();
    public void agregarSismo(Sismo sismo) {
        registro.add(sismo);
    }
    public Sismo generarSismo(int dia){

        double magnitud = Aleatorio.devolverMagnitud();
        int hora = Aleatorio.devolverHora();
        Sismo sismo = new Sismo(dia, hora, magnitud);
        return sismo;
    }
    public  void llenarRegistro(int dias){

        for(int i = 1; i <= dias; i++){
            for(int j = 1; j <= 24; j++){
                Sismo sismo = generarSismo(i);
                agregarSismo(sismo);
            }
        }
    }
    public double sismoMasFuerte(){
        Sismo sismoMasFuerte = registro.get(0);
        for(Sismo sismo : registro){
            if(sismo.getMagnitud() > sismoMasFuerte.getMagnitud()){
                sismoMasFuerte = sismo;
            }
        }
        return sismoMasFuerte.getMagnitud();
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
    public  void vaciarRegistro(){
        registro.clear();
    }
}
