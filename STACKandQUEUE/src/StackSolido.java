// Lo stack è una struttura dati che adotta una politica di tipo LIFO (last-in first-out),
// ovvero l'ultimo elemento inserito è sempre il primo ad essere estratto

import java.util.ArrayList;

public class StackSolido {

    private ArrayList<Solido> stack;

    public StackSolido() {
        this.stack = new ArrayList<>();
    }

    public void push(Solido s) throws CloneNotSupportedException {
        stack.add(s.clone());
    }

    public Solido pop() {
        return stack.removeLast();
    }
}
