import java.util.ArrayList;

public class Gara {
    private String gara;
    private String risultato;
    private ArrayList<Auto> collezione = new ArrayList<>();
    public Gara(String gara, ArrayList<Auto> collezione){
        this.gara = gara;
        this.collezione = collezione;
    }
    public void nuovaAuto(Auto auto){
        collezione.add(auto);
    }
}
