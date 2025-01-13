package BackEnd;
import java.util.Objects;

public class Libro {
    private String autore, titolo;
    private int nPagine;
    private final double costoPagina = 0.05;
    private Genere tipo;

    public Libro(String autore, String titolo, int nPagine) {
        this.autore = autore;
        this.titolo = titolo;
        this.nPagine = nPagine;
    }

    public Libro(String autore, String titolo) {
        this(autore, titolo, 0);
    }

    public Libro (Libro l){
        this.autore = l.autore;
        this.titolo = l.titolo;
        this.nPagine = l.nPagine;
        this.tipo = l.tipo;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getnPagine() {
        return nPagine;
    }

    public double getCostoPagina() {
        return costoPagina;
    }
    @Override
    public String toString(){
        return String.format("Autore: %s Titolo: %s NumeroPagine: %d Costo: %.2f", autore, titolo, nPagine, costoPagina * nPagine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autore, titolo);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Libro){
            return this.autore.equals(((Libro) o).autore) && this.titolo.equals(((Libro) o).titolo);
        }
        return false;
    }
}