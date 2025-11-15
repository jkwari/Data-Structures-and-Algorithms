package Stack;

public class StackArray<T> {

    private T[] stack;
    private int capacity;
    private int top;

    public StackArray(int size) {
        stack = (T[]) new Object(size);
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
    public void push(T data) {
        if (isFull()) {
            return;
        } else {
            stack[++top] = data;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null; // for generic type, null indicates empty
        } else {
            return stack[top--];
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stack[top];
        }
    }

    public boolean validParentheses(T[] parantheses) {
        if (parantheses == null) {
            return false;
        }
        for (T symbol : parantheses) {
            // Those are openings ( { [
            if (symbol.equals("{") || symbol.equals("(") || symbol.equals("[")) {
                push(symbol);
            } else if (symbol.equals("}") || symbol.equals(")") || symbol.equals("]")) {
                if (isEmpty()) {
                    return false;
                }

                T temp = peek();
                if (temp.equals("}") && symbol.equals("{")
                        || temp.equals("]") && symbol.equals("[")
                        || temp.equals(")") && symbol.equals("(")) {
                    pop();

                } else {
                    return false;
                }
            }

        }
        return isEmpty(); // if this is true so there is a match parentheses because we popped them
                          // earlier
    }

}
