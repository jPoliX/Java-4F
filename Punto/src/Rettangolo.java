import java.util.ArrayList;

public class Rettangolo {
    private Punto puntoAltoSx;
    private double base;
    private double altezza;
    private String colore;
    private Punto puntoBassoDx;
    public Rettangolo(Punto puntoAltoSx, Punto puntoBassoDx, String colore) { //costruttore master
        Punto puntoAltoDx = new Punto(puntoBassoDx.getX(), puntoAltoSx.getY());
        Punto puntoBassoSx = new Punto(puntoAltoSx.getX(), puntoAltoDx.getX());

        base = puntoBassoSx.getX() + puntoBassoDx.getX();
        altezza = puntoAltoSx.getY() - puntoBassoSx.getY();

        this.puntoAltoSx = puntoAltoSx;
        this.puntoBassoDx = puntoBassoDx;
        this.colore = colore;
    }
    public Rettangolo(Punto punto1, Punto punto2){
        this(punto1, punto2, null); //per l'overloading dei costruttori
    }
    public double calcolaPerimetro(){
        return 2 * ( base + altezza);
    }
    public double calcolaArea(){
        return base * altezza;
    }
    public boolean isRettangolo(){
        if(base != altezza){
            return true;
        }
        return false;
    }
    public boolean isQuadrato(){
        return !isRettangolo();
    }

    @Override
    public String toString(){
        if(colore == null){
            return "PuntoAltoSx: " + puntoAltoSx + " PuntoBassoDx: " + puntoBassoDx + " Base: " + base + " Altezza: " + altezza + " Colore non impostato";
        }
        return "PuntoAltoSx: " + puntoAltoSx + " PuntoBassoDx: " + puntoBassoDx + " Base: " + base + " Altezza: " + altezza + " Colore: " + colore;
    }
}
