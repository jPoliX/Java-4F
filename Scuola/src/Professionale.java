class Professionale extends Superiori {

    public Professionale(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroLaboratori) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, numeroLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return numeroClassi * 2400 + numeroLaboratori * 3000;
    }
}