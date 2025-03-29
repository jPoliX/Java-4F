class Liceo extends Superiori {


    public Liceo(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroLaboratori) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, numeroLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return numeroStudenti * 150 + numeroLaboratori * 1100;
    }
}
