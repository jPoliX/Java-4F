// Lo queue è una struttura dati che adotta una politica di tipo FIFO (first-in first-out),
// ovvero il primo elemento inserito è sempre il primo ad essere estratto

import java.util.ArrayList;

public class QueueSolido {

    private ArrayList<Solido> queue;

    public QueueSolido() {
        this.queue = new ArrayList<>();
    }

    public void enqueue(Solido s) throws CloneNotSupportedException {
        queue.add(s.clone());
    }

    public Solido dequeue() {
        return queue.removeFirst();
    }
}
