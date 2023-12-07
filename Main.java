package Day_14;

public class Main {
    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        q.add(56);
        q.add(30);
        q.add(70);

        q.remove();
        q.displayQueue();
    }
}
