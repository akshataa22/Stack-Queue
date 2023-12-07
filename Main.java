package Day_14;

public class Main {
    public static void main(String[] args) {
        StackQueue s = new StackQueue();
        s.push(70);
        s.push(30);
        s.push(56);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        s.displayStack();
    }
}
