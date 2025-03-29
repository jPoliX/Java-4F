
class Tecnico extends Superiori {

    public Tecnico(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroClassi, int numeroLaboratori) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, numeroClassi, numeroLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return numeroClassi * 3500 + numeroLaboratori * 6000;
    }
}