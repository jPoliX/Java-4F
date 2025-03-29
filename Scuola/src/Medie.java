class Medie extends Scuola {
    public Medie(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroLaboratori, int numeroSediAggiuntive) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, 0, numeroSediAggiuntive, numeroLaboratori);
    }

    @Override
    public double calcolaContributo() {
        return numeroStudenti * 150 + numeroLaboratori * 1100 + numeroSediAggiuntive * 9000;
    }
}