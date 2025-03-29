abstract class Scuola {
    protected String codice;
    protected String denominazione;
    protected String indirizzo;
    protected String citta;
    protected int numeroStudenti;
    protected int numeroClassi;
    protected int numeroSediAggiuntive;
    protected int numeroLaboratori;

    public Scuola(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroSediAggiuntive, int numeroLaboratori) {
        this.codice = codice;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.numeroStudenti = numeroStudenti;
        this.numeroClassi = numeroClassi;
        this.numeroSediAggiuntive = numeroSediAggiuntive;
        this.numeroLaboratori = numeroLaboratori;
    }

    public abstract double calcolaContributo();

    @Override
    public String toString() {
        return "Scuola: " + denominazione + ", Città: " + citta + ", Contributo: " + calcolaContributo() + "€";
    }
}