import java.util.ArrayList;

public class Istituto {
    //Inserire dipendenti assicurandosi che il nome non corrisponda, stampare gli incentivi dei dipendenti
    private ArrayList<Dipendente> scuola;
    private String nome;

    public Istituto(String nome) {
        this.nome = nome;
        scuola = new ArrayList<>();
    }

    public ArrayList<Dipendente> getScuola() {
        return scuola;
    }

    public void setScuola(ArrayList<Dipendente> scuola) {
        this.scuola = scuola;
    }

    public void addDipendente(Dipendente d) throws Exception {
        if (!scuola.contains(d)) { //usa l'equals per controllare
            scuola.add(d);
        } else {
            throw new Exception("Già presente");
        }
    }
}
