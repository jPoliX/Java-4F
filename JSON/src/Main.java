import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gson tgson = new Gson();
        Persona p = new Persona("Giovanni", 30);
        String json = tgson.toJson(p); //serializzazione (portare dati in serie in un file (qui è una stringa))
        System.out.println(json);
        Persona personaFromJson = tgson.fromJson(json, Persona.class);
        System.out.println(personaFromJson);
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(p);
        persone.add(new Persona("Messi", 37));
        persone.add(new Persona("Stefania", 23));
        persone.add(new Persona("Marchetto", 90));
        // serializzazione della collezione persone su file in formato json
        Gson newJson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = newJson.toJson(persone);
        // System.out.println(jsonContent);
        try {
            Files.write(Paths.get("persone.json"), jsonContent.getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // deserializzazione
        try {
            byte[] jsonData = Files.readAllBytes(Path.of("persone.json"));
            Persona[] collezione = tgson.fromJson(new String(jsonData), Persona[].class);
            ArrayList<Persona> archivio = new ArrayList<>(Arrays.asList(collezione));
            System.out.println("ARCHIVIO DESERIALIZZATO");
            System.out.println(archivio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}