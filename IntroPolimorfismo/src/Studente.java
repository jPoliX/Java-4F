public class Studente extends Persona {
    public Studente(String nome, String cognome, String luogoDiNascita, String colorePreferito, String squadraDelCuore, int eta) {
        super(nome, cognome, luogoDiNascita, colorePreferito, squadraDelCuore, eta); //super chiama il costruttore della classe genitore (Persona)
    }
    @Override
    public String presentazione(){
        return super.presentazione() + " e sono anche uno studente";
    }
}