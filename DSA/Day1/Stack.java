
public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int num) {
        if (top < stack.length) {
            stack[top] = num;
            top++;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        for (int i = 0; i < myStack.stack.length; i++) {
            myStack.push(i + 1);
        }

        System.out.println("Elements in the stack:");

        for (int i = 0; i < myStack.top; i++) {
            System.out.println(myStack.stack[i]);
        }
    }
}
