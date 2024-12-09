import java.util.Scanner;

import static utility.Tools.*;
public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        try{
            Pilota p1 = new Pilota("messi", "marchetto", "Islanda");
            System.out.println(p1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
