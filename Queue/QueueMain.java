public class QueueMain {

    public static void main(String[] args) throws Exception{

        CircularQueue queue = new CircularQueue(5);

        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.remove();
        System.out.println(queue.front());
        queue.display();
        System.out.println(queue.isEmpty());
    }
}
