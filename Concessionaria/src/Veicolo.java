public class Veicolo {
    private String marca;
    private String modello;
    private double prezzo;

    public Veicolo(String marca, double prezzo, String modello) {
        this.marca = marca;
        this.prezzo = prezzo;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    @Override
    public String toString(){
        return String.format("%s - %s - %.2f", marca, modello, prezzo);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Veicolo){
            return this.marca.equals(((Veicolo)o).marca) && this.modello.equals(((Veicolo)o).modello);
        }
        return false;
    }
}