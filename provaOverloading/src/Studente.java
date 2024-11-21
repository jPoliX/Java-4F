public class Studente {
    private String nome;
    private String cognome;
    private double media;
    private int matricola;

    public Studente(String nome){
        this.nome = nome;
    }
    public Studente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }

    public double getMedia() {
        return media;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
