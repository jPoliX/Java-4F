import java.util.ArrayList;

public class Rettangolo {
    private Punto puntoAltoSx;
    private int base;
    private int altezza;
    private ArrayList<Segmento> segmenti;

    public Rettangolo(Punto puntoAltoSx, int base, int altezza) throws Exception {
        if (puntoAltoSx.getX() < 0 || puntoAltoSx.getY() < 0) {
            throw new Exception("Il punto deve essere nel primo quadrante");
        }

        this.puntoAltoSx = puntoAltoSx;
        this.base = base;
        this.altezza = altezza;

        Punto puntoAltoDx = new Punto(puntoAltoSx.getX() + base, puntoAltoSx.getY());
        Punto puntoBassoDx = new Punto(puntoAltoSx.getX() + base, puntoAltoSx.getY() - altezza);
        Punto puntoBassoSx = new Punto(puntoAltoSx.getX(), puntoAltoSx.getY() - altezza);

        segmenti = new ArrayList<>();
        segmenti.add(new Segmento(puntoAltoSx, puntoAltoDx));
        segmenti.add(new Segmento(puntoAltoDx, puntoBassoDx));
        segmenti.add(new Segmento(puntoBassoDx, puntoBassoSx));
        segmenti.add(new Segmento(puntoBassoSx, puntoAltoSx));
    }

    public ArrayList<Segmento> getSegmenti() {
        return segmenti;
    }

    public double calcolaPerimetro() {
        double perimetro = 0;
        for (int i = 0; i < segmenti.size(); i++) {
            perimetro += segmenti.get(i).calcolaLunghezza();
        }
        return perimetro;
    }

    public double calcolaArea() {
        return base * altezza;
    }
}