class Elementari extends Scuola {
    public Elementari(String codice, String denominazione, String indirizzo, String citta, int numeroStudenti, int numeroSediAggiuntive) {
        super(codice, denominazione, indirizzo, citta, numeroStudenti, 0, numeroSediAggiuntive, 0);
    }

    @Override
    public double calcolaContributo() {
        return numeroStudenti * 125 + numeroSediAggiuntive * 9000;
    }
}