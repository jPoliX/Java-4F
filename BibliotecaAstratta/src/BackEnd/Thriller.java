package BackEnd;

public class Thriller extends Libro {
    private boolean serie;

    public Thriller(String autore, String titolo, int nPagine, boolean serie) {
        super(autore, titolo, nPagine);
        this.serie = serie;
    }

    public Thriller(Thriller libro) {
        super(libro);
    }

    public boolean isSerie() {
        return serie;
    }

    public void setSerie(boolean serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Serie TV: %s", serie);
    }

    @Override
    public String dettagli() {
        return String.format("Thriller: %s di %s, Serie TV: %s", getTitolo(), getAutore(), serie ? "Sì" : "No");
    }
}
