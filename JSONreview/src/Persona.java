public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private boolean sportivo;

    public Persona(String nome, String cognome, int eta, boolean sportivo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sportivo = sportivo;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s Cognome: %s Età: %d Sportivo: %s", nome, cognome, eta, sportivo);
    }
}
