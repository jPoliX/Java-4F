package BackEnd;

public class Manuale extends Libro {
    private String argomento;
    private Livello livello;

    public Manuale(String autore, String titolo, int nPagine, String argomento, Livello livello) {
        super(autore, titolo, nPagine);
        this.argomento = argomento;
        this.livello = livello;
    }

    public Manuale(Manuale libro) {
        super(libro);
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }

    public Livello getLivello() {
        return livello;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Argomento: %s Livello: %s", argomento, livello);
    }

    @Override
    public String dettagli() {
        return String.format("Manuale: %s di %s, Argomento: %s, Livello: %s", getTitolo(), getAutore(), argomento, livello);
    }
}
