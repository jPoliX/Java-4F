import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXAUTO = 30;
        ArrayList<Automobile> concessionaria = new ArrayList<>();

        for(int i = 0; i < 3; i++){

            if(concessionaria.size() < MAXAUTO){
                Automobile auto = inserisci(tastiera);
                concessionaria.add(auto);
                concessionaria.forEach(m -> System.out.println(m.toString()));
            } else
                System.out.println("concessionaria piena");
        }



    }
    public static Automobile inserisci(Scanner tastiera){
        Automobile auto = new Automobile();
        System.out.println("Inserisci la marca");
        auto.marca = tastiera.nextLine();
        System.out.println("Inserisci il modello");
        auto.modello = tastiera.nextLine();
        System.out.println("Inserisci la data di produzione");
        auto.produzione = LocalDate.parse(tastiera.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Inserisci la cilindrata");
        auto.cilindrata = Integer.parseInt(tastiera.nextLine());

        return auto;
    }
}
