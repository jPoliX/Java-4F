public class Persona {
    protected String nome, cognome, luogoDiNascita, colorePreferito, squadraDelCuore;
    protected int eta;

    public Persona(String nome, String cognome, String luogoDiNascita, String colorePreferito, String squadraDelCuore, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.luogoDiNascita = luogoDiNascita;
        this.colorePreferito = colorePreferito;
        this.squadraDelCuore = squadraDelCuore;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getLuogoDiNascita() {
        return luogoDiNascita;
    }

    public String getColorePreferito() {
        return colorePreferito;
    }

    public String getSquadraDelCuore() {
        return squadraDelCuore;
    }

    public int getEta() {
        return eta;
    }

    public void setColorePreferito(String colorePreferito) {
        this.colorePreferito = colorePreferito;
    }

    public void setSquadraDelCuore(String squadraDelCuore) {
        this.squadraDelCuore = squadraDelCuore;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public String presentazione(){
        return String.format("Ciao sono %s", nome);
    }
}
