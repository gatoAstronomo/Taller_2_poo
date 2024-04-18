package proyect;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class RegistroSismatologico {
    ArrayList<Sismo> registro = new ArrayList<Sismo>();
    public void agregarSismo(Sismo sismo) {
        registro.add(sismo);
    }
    public Sismo generarSismo(){
        // aqui se invoca el metodo para generar los datos del sismo de la rama rivas
        return sismo;
    }
    public void llenarRegistro(int cantidadSismos){
        for(int i = 0; i < cantidadSismos; i++){
            Sismo sismo = generarSismo();
            agregarSismo(sismo);
        }
    }
}
