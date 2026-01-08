public class StackUsingArray {

    // Array to store stack elements
    int[] stack;

    // Variable to track top of stack
    int top;

    // Maximum size of stack
    int capacity;

    // ---------------- CONSTRUCTOR ----------------
    StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // stack is empty initially
    }

    // ---------------- PUSH OPERATION ----------------
    // Adds an element to the top of the stack
    void push(int value) {

        // Check stack overflow
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }

        top++;              // move top pointer
        stack[top] = value; // insert value

        // Example Output:
        // Pushed: 10
        System.out.println("Pushed: " + value);
    }

    // ---------------- POP OPERATION ----------------
    // Removes and returns the top element
    int pop() {

        // Check stack underflow
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop");
            return -1;
        }

        int poppedValue = stack[top];
        top--; // decrease top

        // Example Output:
        // Popped: 30
        System.out.println("Popped: " + poppedValue);

        return poppedValue;
    }

    // ---------------- PEEK OPERATION ----------------
    // Returns the top element without removing it
    int peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Example Output:
        // Top element is: 20
        return stack[top];
    }

    // ---------------- isEmpty OPERATION ----------------
    boolean isEmpty() {
        return top == -1;

        // Output example:
        // true  (if stack is empty)
        // false (if stack has elements)
    }

    // ---------------- isFull OPERATION ----------------
    boolean isFull() {
        return top == capacity - 1;
    }

    // ---------------- DISPLAY STACK ----------------
    void display() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");

        // Printing stack from bottom to top
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        // Example Output:
        // Stack elements: 10 20
        System.out.println();
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        // Creating stack of size 3
        StackUsingArray s = new StackUsingArray(3);

        // PUSH operations
        s.push(10);   // Pushed: 10
        s.push(20);   // Pushed: 20
        s.push(30);   // Pushed: 30
        s.push(40);   // Stack Overflow! Cannot push 40

        // DISPLAY stack
        // Output: Stack elements: 10 20 30
        s.display();

        // PEEK operation
        // Output: Top element is: 30
        System.out.println("Top element is: " + s.peek());

        // POP operations
        s.pop(); // Popped: 30
        s.pop(); // Popped: 20

        // DISPLAY stack
        // Output: Stack elements: 10
        s.display();

        // Check isEmpty
        // Output: false
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}

