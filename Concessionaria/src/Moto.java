public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, double prezzo, String modello, int cilindrata) {
        super(marca, prezzo, modello);
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "%d", cilindrata);
    }
}
