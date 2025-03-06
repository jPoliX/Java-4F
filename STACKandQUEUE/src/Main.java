public class Main {

    private static StackSolido ;

    public static void main(String[] args) {
        Sfera s1 = new Sfera(4,5);
        Cubo c1 = new Cubo(4,5);
        Cubo c2 = new Cubo(4,5);
        StackSolido stack = new StackSolido();
        try {
            stack.push(s1);
            stack.push(c1);
            stack.push(c2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("-----------------------------");

        QueueSolido queue = new QueueSolido();
        try {
            queue.enqueue(s1);
            queue.enqueue(c1);
            queue.enqueue(c2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}