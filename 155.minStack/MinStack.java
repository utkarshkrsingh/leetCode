import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<Integer> stack;
    private List<Integer> min;
    private int top;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.min = new ArrayList<>();
        this.top = -1;
    }

    public void push(int val) {
        this.stack.add(val);
        this.top++;
        if (min.isEmpty() || val <= min.get(min.size() - 1)) {
            min.add(val);
        }
    }

    public void pop() {
        if (stack.get(top).equals(min.get(min.size() - 1))) {
            min.remove(min.size() - 1);
        }
        stack.remove(top--);
    }

    public int top() {
        return stack.get(top);
    }

    public int getMin() {
        return min.get(min.size() - 1);
    }
}