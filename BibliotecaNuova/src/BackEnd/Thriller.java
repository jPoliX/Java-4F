package BackEnd;

public class Thriller extends Libro{
    private boolean serie;
    public Thriller(String autore, String titolo, int nPagine, boolean serie) {
        super(autore, titolo, nPagine);
        this.serie = serie;
    }

    public boolean isSerie() {
        return serie;
    }

    public void setSerie(boolean serie) {
        this.serie = serie;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + " Serie TV: %s", serie);
    }
}
