public class RunClass {

    public static void main(String[] args) throws Exception{

        CustomStack stack = new CustomStack();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        System.out.println(stack.isFull());
        stack.display();

        System.out.println(stack.peek());
    }
}
