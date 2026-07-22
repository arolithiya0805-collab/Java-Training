package Day25;
    import java.util.Stack;

public class Problem8 {

class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek() {
        if (out.empty())
            while (!in.empty())
                out.push(in.pop());
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }
}
}
