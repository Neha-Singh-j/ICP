package ICP.Home_Assignment10;

public class implement_stack_using_queue {
    private Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while (size-- > 1) {
            q.add(q.remove()); 
        }
    }
    public int pop() {
        return q.remove();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
}
