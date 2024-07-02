public class CircularQueue {

    public int[] data;
    public static int DEFAULT_SIZE = 5;
    int front, end = 0;
    int size = 0;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean add(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        data[end++] = item;
        end = (end)  % data.length;
        size++;
        return true;
}

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }

        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i = i % data.length;
        } while( i != end);
        System.out.println("End");
    }
}
