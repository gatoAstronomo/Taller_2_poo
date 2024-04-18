package proyect;

public class Sismo {
    private int dia;
    private int hora;
    private double magnitud;
    public Sismo(int dia, int hora, double magnitud) {
        this.dia = dia;
        this.hora = hora;
        this.magnitud = magnitud;
    }
    public int getDia() {
        return dia;
    }
    public double getMagnitud() {
        return magnitud;
    }
}

