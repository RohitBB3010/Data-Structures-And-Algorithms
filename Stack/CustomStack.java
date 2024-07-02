
public class CustomStack {

    protected int[] data;
    public static int DEFAULT_SIZE = 5;
    int pointer = 0;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return pointer == data.length;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }

    public boolean push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Cannot add item in full stack");
        }

        data[pointer] = item;
        pointer++;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty stack");
        }

        int removedElement = data[pointer];
        pointer--;
        return removedElement;
    }

    public int peek(){
        return data[--pointer];
    }

    public void display(){

        for(int i = 0; i < pointer; i++){
            System.out.print(data[i] + "->");
        }
        System.out.println("End");
    }
}
