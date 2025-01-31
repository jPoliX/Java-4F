public class Automobile extends Veicolo{
    private int nPorte;
    public Automobile(String marca, double prezzo, String modello, int nPorte) {
        super(marca, prezzo, modello);
        this.nPorte = nPorte;
    }

    public int getnPorte() {
        return nPorte;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "%d", nPorte);
    }
}
