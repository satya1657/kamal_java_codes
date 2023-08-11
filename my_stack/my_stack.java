package my_stack;

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Mystack {
    Node top;

    Mystack() {
        this.top = null;
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.print("  " + temp.data);
            temp = temp.next;
        }

        System.out.println();
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;

    }

    public int pop() {
        if (top == null)
            return -1;

        int r = top.data;
        top = top.next;
        return r;
    }

    public int peek() {
        return (top == null) ? -1 : top.data;
    }
}

public class my_stack {
    public static void main(String[] args) {
        Mystack st = new Mystack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.print();

    }
}
