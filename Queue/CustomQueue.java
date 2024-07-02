public class CustomQueue {

    protected int[] data;
    public static int DEFAULT_SIZE = 5;
    int end = 0;

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return  end == 0;
    }

    public boolean add(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removedElement = data[end];
        end--;
        return removedElement;
    }

    public int front(){
        return data[0];
    }

    public void display(){
        for(int i = 0; i < end; i++){
            System.out.print(data[i] + "->");
        }
        System.out.println("End");
    }
}
