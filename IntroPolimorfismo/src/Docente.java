public class Docente extends Persona {
    private String disciplina;
    public Docente(String nome, String cognome, String luogoDiNascita, String colorePreferito, String squadraDelCuore, int eta) {
        super(nome, cognome, luogoDiNascita, colorePreferito, squadraDelCuore, eta);
    }
    @Override
    public String presentazione(){
        return super.presentazione() + " e sono anche un docente";
    }
}
