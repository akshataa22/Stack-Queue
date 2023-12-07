package Day_14;

public class StackQueue {
    public static Node head;
    public static void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void displayStack(){
        Node newNode = head;
        while(newNode!=null) {
            System.out.print(newNode.data + "-->");
            newNode = newNode.next;
        }
    }
}
