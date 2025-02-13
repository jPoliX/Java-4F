import java.util.ArrayList;
import java.lang.Object;

public class Teatro {
    ArrayList<Persona> persone;
    final int MAXPERSONE = 10;

    public Teatro() {
        persone = new ArrayList<>();
    }

    public void entrataTeatro(Persona p) throws Exception {
        if (!(persone.contains(p)) && persone.size() < MAXPERSONE) {

            try {
                Persona clonePersona;
                clonePersona = p.clone();
                persone.add(clonePersona);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new Exception("Questa persona è già presente all'interno del teatro");
        }
    }

    public void stampaAVideo() { //NON DA FARE POICHE' NON E' BUONA PRATICA STAMPARE DA DENTRO LE CLASSI, BISOGNA RITORNARE UNA NUOVA LISTA E STAMPARLA
        for (Persona persona : persone) {
            System.out.println(persona.presentazione());
        }
    }
}
