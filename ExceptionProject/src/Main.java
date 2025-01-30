
public class Main {
    public static void main(String[] args) {
        Exception e = new Exception();
        System.out.println(e.getClass());
        System.out.println(Exception.class.getSuperclass());
        System.out.println(Throwable.class.getSuperclass());
        System.out.println(Object.class.getSuperclass());

        Orario ora = new Orario(-2, 5, 43);
    }
}