import java.util.ArrayList;

public class Rettangolo {
    private Punto puntoAltoSx;
    private double base;
    private double altezza;
    private Punto puntoBassoDx;
    private ArrayList<Segmento> segmenti;

    public Rettangolo(Punto puntoAltoSx, Punto puntoBassoDx) {
        Punto puntoAltoDx = new Punto(puntoBassoDx.getX(), puntoAltoSx.getY());
        Punto puntoBassoSx = new Punto(puntoAltoSx.getX(), puntoAltoDx.getX());

        base = puntoBassoSx.getX() + puntoBassoDx.getX();
        altezza = puntoAltoSx.getY() - puntoBassoSx.getY();
        this.puntoAltoSx = puntoAltoSx;
        this.puntoBassoDx = puntoBassoDx;
    }
    public double calcolaPerimetro(){
        return 2 * ( base + altezza);
    }
    public double calcolaArea(){
        return base * altezza;
    }
}