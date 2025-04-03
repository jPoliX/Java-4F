import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(new Persona("NOME1", "COGNOME1", 21, true));
        persone.add(new Persona("NOME2", "COGNOME2", 22, false));
        persone.add(new Persona("NOME3", "COGNOME3", 23, true));
        persone.add(new Persona("NOME4", "COGNOME4", 24, false));
        persone.add(new Persona("NOME5", "COGNOME5", 25, true));
        try {
            salvaJSON("Persone.json", persone);
            leggiJSON("Persone.json");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void salvaJSON(String fileName, ArrayList<Persona> persone) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = gson.toJson(persone);
        Files.write(Paths.get(fileName), jsonContent.getBytes());
    }
    public static String leggiJSON(String fileName) throws IOException {
        Gson gson = new Gson();
        byte[] jsonData = Files.readAllBytes(Path.of(fileName));
        Persona[] persone = gson.fromJson(new String(jsonData), Persona[].class);
        
    }
}