import java.util.Objects;

public class Persona {
    protected String nome;
    protected String cognome;
    protected int eta;
    protected String luogoDiNascita;
    protected String colorePreferito;
    protected String squadraDelCuore;

    Persona() {
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
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

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setColorePreferito(String colorePreferito) {
        this.colorePreferito = colorePreferito;
    }

    public void setSquadraDelCuore(String squadraDelCuore) {
        this.squadraDelCuore = squadraDelCuore;
    }

    public Persona(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.luogoDiNascita = luogoDiNascita;
        this.colorePreferito = colorePreferito;
        this.squadraDelCuore = squadraDelCuore;
    }

    public String presentazione() {
        return String.format(" Ciao sono una persona e il mio nome è %s, il mio colore preferito è %s", nome, colorePreferito);
    }

    public String metodoGenerico() {
        return "Io sono il metodo generico di persona";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return nome.equals(persona.nome);
    }
    @Override
    protected Persona clone()throws CloneNotSupportedException{
        return (Persona) super.clone();
    }
}
