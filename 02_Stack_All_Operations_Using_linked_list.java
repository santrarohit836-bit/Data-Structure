// Stack implementation using Linked List
class StackUsingLinkedList {

    // ================= NODE CLASS =================
    // Each node represents one element of the stack
    static class Node {
        int data;     // value stored in node
        Node next;    // reference to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack (head of linked list)
    Node top = null;

    // ================= PUSH OPERATION =================
    // Inserts an element at the top of the stack
    void push(int value) {

        Node newNode = new Node(value);

        // If stack is empty
        if (top == null) {
            top = newNode;
        } 
        // If stack is not empty
        else {
            newNode.next = top;
            top = newNode;
        }

        // OUTPUT:
        // push(10) → 10 pushed into stack
        // push(20) → 20 pushed into stack
        System.out.println(value + " pushed into stack");
    }

    // ================= POP OPERATION =================
    // Removes and returns the top element
    int pop() {

        // If stack is empty
        if (top == null) {
            // OUTPUT:
            // Stack Underflow! No element to pop.
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }

        int removedValue = top.data;
        top = top.next;

        // OUTPUT:
        // pop() → returns 30
        return removedValue;
    }

    // ================= PEEK OPERATION =================
    // Returns top element without removing it
    int peek() {

        if (top == null) {
            // OUTPUT:
            // Stack is empty. Nothing to peek.
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }

        // OUTPUT:
        // peek() → returns 30
        return top.data;
    }

    // ================= isEmpty OPERATION =================
    boolean isEmpty() {

        // OUTPUT:
        // true  → stack is empty
        // false → stack is not empty
        return top == null;
    }

    // ================= DISPLAY STACK =================
    void display() {

        if (top == null) {
            // OUTPUT:
            // Stack is empty.
            System.out.println("Stack is empty.");
            return;
        }

        Node temp = top;
        System.out.print("Stack elements: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // OUTPUT:
        // Stack elements: 30 20 10
        System.out.println();
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        // OUTPUT: 10 pushed into stack
        // Stack: 10

        stack.push(20);
        // OUTPUT: 20 pushed into stack
        // Stack: 20 -> 10

        stack.push(30);
        // OUTPUT: 30 pushed into stack
        // Stack: 30 -> 20 -> 10

        stack.display();
        // OUTPUT: Stack elements: 30 20 10

        System.out.println("Top element: " + stack.peek());
        // OUTPUT: Top element: 30

        System.out.println("Popped element: " + stack.pop());
        // OUTPUT: Popped element: 30
        // Stack after pop: 20 -> 10

        stack.display();
        // OUTPUT: Stack elements: 20 10
    }
}
