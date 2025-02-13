public class Studente extends Persona {
    public Studente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);
    }

    public Studente() {
        super();
    }

    @Override
    public String presentazione() {
        return super.presentazione() + " e sono anche uno studente";
    }

    public String presentazione2() {
        return "ATTENZIONE! " + super.presentazione();
    }

    public String metodoNuovo() {
        return "ciao sono metodoNuovo di Studente";
    }
}
