public class Test {
    public static void main(String[] args) {
        Queuee queue = new Queuee();
        queue.enqueue(2);
        queue.enqueue(6);
        queue.enqueue(7);
        for (int i = 0; i < 2; i++) {
            System.out.println(queue.dequeue().key);
        }

    }
}
