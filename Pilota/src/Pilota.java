import java.util.ArrayList;

public class Pilota {
    private String nome, cognome, nazionalita;
    public Pilota(String nome, String cognome, String nazionalita) throws Exception{
        if(isValido(nome) && isValido(cognome) && isValido(nazionalita)){
            this.nome = nome;
            this.cognome = cognome;
            this.nazionalita = nazionalita;
        }else {
            throw new Exception("Valori non validi");
        }
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getNazionalita() {
        return nazionalita;
    }
    private boolean isValido(String str){
        return str != null && !str.isEmpty();
    }

    @Override
    public String toString() {
        return "Pilota:" + " nome: " + nome  + ", cognome: " + cognome;
    }
    @Override
    public boolean equals(Object obj){
        if(obj != null || obj.getClass() != this.getClass()){
            return false;
        }
        return this.nome.equals(((Pilota) obj).nome) && this.cognome.equals(((Pilota) obj).cognome) && this.nazionalita.equals(((Pilota) obj).nazionalita);
    }
}
