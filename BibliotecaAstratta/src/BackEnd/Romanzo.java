package BackEnd;

public class Romanzo extends Libro {
    private Genere genere;

    public Romanzo(String autore, String titolo, int nPagine, Genere genere) {
        super(autore, titolo, nPagine);
        this.genere = genere;
    }

    public Romanzo(Romanzo libro) {
        super(libro);
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Genere: %s", genere);
    }

    @Override
    public String dettagli() {
        return String.format("Romanzo: %s di %s, Genere: %s", getTitolo(), getAutore(), genere);
    }
}
