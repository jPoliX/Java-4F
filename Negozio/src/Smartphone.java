public class Smartphone extends ProdottoElettronico {
    private String modello;
    private int memoria;

    public Smartphone(String codiceProdotto, String marca, double prezzo, String modello, int memoria) {
        super(codiceProdotto, marca, prezzo);
        this.modello = modello;
        this.memoria = memoria;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Modello: %s Memoria: %d", modello, memoria);
    }
}
