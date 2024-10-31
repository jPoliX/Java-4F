import java.time.LocalDate;

public class Automobile {
    public String marca;
    public String modello;
    public LocalDate produzione;
    public int cilindrata;

    @Override
    public String toString(){
        return String.format("Marca: %s Modello: %s Data di Produzione: %s Cilindrata: %d ", marca, modello, produzione, cilindrata);
    }
}
