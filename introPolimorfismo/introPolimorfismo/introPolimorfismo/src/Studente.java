public class Studente extends Persona {
    private Libro libro;

    public Studente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);
    }

    public Studente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore, Libro libro) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);
        this.libro = libro;
    }

    @Override
    public String presentazione() {
        if (libro != null) {
            return super.presentazione() + " e sono anche uno studente, e il titolo del mio libro è: " + libro.getTitolo();
        }
        return super.presentazione() + " e sono anche uno studente";
    }

    public String presentazione2() {
        return "ATTENZIONE! " + super.presentazione();
    }

    public String metodoNuovo() {
        return "ciao sono metodoNuovo di Studente";
    }
}
