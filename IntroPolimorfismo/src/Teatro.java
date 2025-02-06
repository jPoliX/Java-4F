import java.util.ArrayList;

public class Teatro {
    private ArrayList<Persona> persone = new ArrayList<>();
    private final int MAXPERSONE = 10;
    public void entrataTeatro(Persona p) throws Exception {
            if (!persone.contains(p) && persone.size() <= MAXPERSONE) {
                persone.add(p);
            } else {
                throw new Exception("Persona già presente o teatro pieno");
            }
    }
    public void stampa(){
        for(Persona persona : persone){
            System.out.println(persona.presentazione());
        }
    }
}
