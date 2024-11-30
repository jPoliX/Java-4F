import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        try {
            Studente st = new Studente("Lionelo", "Pepsi", 8, 19);
            Studente st1 = new Studente("Lionelo", "Pepsi", 6, 19);
            st.setEta(89); //prende l'eccezione del metodo setEta
            /*System.out.println(st);
            System.out.println(st1);*/
            if(st.isEquals(st1)){
                System.out.println("Sono uguali");
            } else
                System.out.println("Non sono uguali");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Il programs continua...");

        int numeroMagico = tastiera.nextInt();
        try {
            if (numeroMagico < 100) {
                throw new Exception("Numero minore di 100");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
// st = st1 ==> confronta i due indirizzi di memoria