import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Punto p = new Punto(2, 3);
            Rettangolo r = new Rettangolo(p, p);
            System.out.println("Perimetro: " + r.calcolaPerimetro());
            System.out.println("Area: " + r.calcolaArea());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}