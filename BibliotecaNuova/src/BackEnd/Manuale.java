package BackEnd;

public class Manuale extends Libro{
    private String argomento;
    private Livello livello;
    public Manuale(String autore, String titolo, int nPagine, String argomento, Livello livello) {
        super(autore, titolo, nPagine);
        this.argomento = argomento;
        this.livello = livello;
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
    public String toString(){
        return String.format(super.toString() + " Argomento: %s Livello: %s", argomento, livello);
    }
}
