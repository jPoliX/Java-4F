import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Punto p = new Punto(5, 3);
            Punto p2 = new Punto(2,4);
            Rettangolo r = new Rettangolo(p, p2);
            Rettangolo r2 = new Rettangolo(p, p2, "messi");
            System.out.println("Perimetro: " + r.calcolaPerimetro());
            System.out.println("Area: " + r.calcolaArea());
            System.out.println(r.toString());
            System.out.println(r2.toString());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
