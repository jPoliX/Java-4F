import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Veicolo> concessionaria = new ArrayList<>();

    public Concessionaria(ArrayList<Veicolo> concessionaria) {
        this.concessionaria = concessionaria;
    }

    public void addVeicolo(Veicolo v) throws Exception {
        if (!concessionaria.contains(v)) {
            concessionaria.add(v);
        } else {
            throw new Exception("Già presente");
        }
    }

    public int numVeicoli() {
        return concessionaria.size();
    }
}
