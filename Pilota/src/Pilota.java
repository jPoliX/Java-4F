import java.util.ArrayList;

public class Pilota {
    private String nome, cognome;
    private ArrayList<Pilota> scuderia;
    public Pilota(String nome, String cognome) throws Exception {
        if(nome.equals(null) && cognome.equals(null)) {
            throw new Exception("Nome e cognome sono nulli");
        }
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public ArrayList<Pilota> getScuderia() {
        return scuderia;
    }
    public void setScuderia(ArrayList<Pilota> scuderia) {
        this.scuderia = scuderia;
    }
    @Override
    public String toString() {
        return "Pilota" + "nome: %s" + nome  + ", cognome: %s" + cognome + ", scuderia: %s" + scuderia;
    }
}
