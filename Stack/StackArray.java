package Stack;

public class StackArray {

    private int[] stack;
    private int capacity;
    private int top;

    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // -1 means empty stack
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    // Basic Stack Operations
    public void push(int data) {
        if (isFull()) {
            return;
        } else {
            // ++top is used here because the starting index for Arrays is 0
            // and the initial value for top is -1
            stack[++top] = data;
        }

    }

    public int pop() {
        if (isEmpty()) {
            // -1 means nothing in this case
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return stack[top];
        }
    }

}
