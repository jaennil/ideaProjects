public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack1 = new Stack<Integer>(5);
        stack1.push(10);
        System.out.println(stack1.top());
        Stack<Element> stack2 = new Stack<Element>(5);
        stack2.push(new Element(10, "aaa"));
        System.out.println(stack2.top().key);
        System.out.println(stack2.top().value);
    }
}