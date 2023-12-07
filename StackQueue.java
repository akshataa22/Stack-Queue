package Day_14;

public class StackQueue {
    public static Node head;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {

        Node newNode = new Node(data);

        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;

    }

    public static void displayStack(){
        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.data + "-->");
            newNode=newNode.next;
        }
        System.out.println("Stack is empty.");
    }
}
