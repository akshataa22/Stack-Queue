package Day_14;

public class StackQueue {
    static Node front;
    static Node rear;

    StackQueue() {
        front = null;
        rear = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front=newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void displayQueue(){
        Node newNode = front;
        while(newNode != null){
            System.out.print(newNode.data+ "-->");
            newNode = newNode.next;
        }
    }
}