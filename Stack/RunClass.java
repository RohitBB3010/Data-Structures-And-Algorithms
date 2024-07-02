public class RunClass {

    public static void main(String[] args) throws Exception{

        DynamicStack stack = new DynamicStack();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);

        stack.display();

        System.out.println(stack.peek());
    }
}
