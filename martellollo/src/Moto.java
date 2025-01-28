public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, String modello, double prezzo, int cilindrata) {
        super(marca, modello, prezzo);
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Cilindrata. %d", cilindrata);
    }
}
