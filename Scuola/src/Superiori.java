class Superiori extends Scuola {

    public Superiori(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroLaboratori) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, 0, numeroLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return 0;
    }
}