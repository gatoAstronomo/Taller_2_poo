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
    public int getHora() {
        return hora;
    }
    public double getMagnitud() {
        return magnitud;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }
}
