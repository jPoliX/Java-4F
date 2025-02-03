public class Camion extends Veicolo{
    private int pesoTrasporto;
    private int altezza;
    private int larghezza;

    public Camion(String marca, double prezzo, String modello, int pesoTrasporto, int altezza, int larghezza) {
        super(marca, prezzo, modello);
        this.pesoTrasporto = pesoTrasporto;
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int getPesoTrasporto() {
        return pesoTrasporto;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setPesoTrasporto(int pesoTrasporto) {
        this.pesoTrasporto = pesoTrasporto;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + " %d - %d - %d", pesoTrasporto, altezza, larghezza);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Camion camion){
            return super.equals(o) && this.altezza == (camion.altezza) && this.larghezza == (camion.larghezza);
        }
        return false;
    }
}
