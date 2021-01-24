import java.util.LinkedList;

public class Queuee<T> {
    private Node Front;
    private Node Rear;
    private LinkedList<T> queue;
    public Queuee(){
        queue = new LinkedList<>();
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (isEmty()){
            Front = Rear = temp;
        }
        Rear.next = temp;
        Rear = temp;
        Rear.next = Front;
    }
    public Node dequeue(){
        if (isEmty()){
            return null;
        }else if (Front == Rear){
            return Front = Rear = null;
        }
        Node temp = Front;
        Front = Front.next;
        return temp;
    }
    public boolean isEmty(){
        if (Front == null){
            return true;
        }
        else return false;
    }
}
class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}
