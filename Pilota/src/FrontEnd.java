import java.util.Scanner;
public class FrontEnd {
    public static Pilota nuovoPilota(Scanner sc){
        Pilota p;
        try {
            p = new Pilota(sc.nextLine(), sc.nextLine(), sc.nextLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
