import java.util.Objects;

public class Dipendente {
    private final String nominativo;
    private final char genere;
    private String indirizzo;
    private final double incentivo = 0.5;

    public Dipendente(String nominativo, char genere, String indirizzo) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.indirizzo = indirizzo;
    }

    public String getNominativo() {
        return nominativo;
    }

    public char getGenere() {
        return genere;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return String.format("%s - %c - %s - %.2f", nominativo, genere, indirizzo, incentivo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dipendente that = (Dipendente) o;
        return this.getNominativo().equals(((Dipendente) o).nominativo);
    }
}
