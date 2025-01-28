import java.util.Objects;

public class Veicolo {
    private final String marca;
    private String modello;
    private double prezzo;

    public Veicolo(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Veicolo) {
            return this.marca.equals(((Veicolo) obj).marca) && this.modello.equals(((Veicolo) obj).modello);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s - Modello: %s - Prezzo: %f", marca, modello, prezzo);
    }
}
