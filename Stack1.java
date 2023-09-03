public class Stack1 {
    Node top;
    
    class Node {
        int item;
        Node next;
    }
    
    public void push(int data) {
        Node temp = new Node();
        temp.item = data;
        System.out.println("Pushing the element: " + temp.item);
        if (top == null) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
    }
    
    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        return top.item;
    }
    
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("No elements to delete.");
        }
        int x = top.item;
        System.out.println("Popping the element: " + x);
        top = top.next;
        return x;
    }
    
    public Stack1 reverselist(Stack s_new) {
        Node temp = top;
        while (temp != null) {
            s_new.push(temp.item);
            temp = temp.next;
        }
        return s_new;
    }
    
    public Stack1 reverselist2() {
        Stack1 s_2 = new Stack1();
        while (!isEmpty()) {
            s_2.push(pop());
        }
        Stack1 t = new Stack1();
        while (!s_2.isEmpty()) {
            t.push(s_2.pop());
        }
        while (!t.isEmpty()) {
            push(t.pop());
        }
        return this;
    }
    
    
    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    
    public static void main(String args[]) {
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.print();
        int t = s.pop();
        s.print();
        int p = s.peek();
        System.out.println("Peek is " + p);
        Stack1 s_new = new Stack1();
        Stack1 reversed = new Stack1();
        reversed = s.reverselist(s_new);
        reversed.print();
        Stack1 l = s.reverselist2(); // Declare and initialize Stack l here
        l.print();
    }
}
