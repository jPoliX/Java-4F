import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        try{
            Punto nuovo = new Punto();
            nuovo.setPuntoX(-2);
            nuovo.setPuntoY(5);
            System.out.println(nuovo.toString());
            System.out.println("Il punto si trova nel " + nuovo.trovaQuadranti());

        /*System.out.println("---------------");
        Punto terzo = new Punto(3,2);
        System.out.println(terzo.trovaQuadranti());*/
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}