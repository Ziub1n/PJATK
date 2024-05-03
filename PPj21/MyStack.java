package PPJ.PPj21;

class MyStack {
    private int[] stack;
    private int top;
    private int size;

    public MyStack(int size) {
        this.stack = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int element) {
        if (this.top == this.size - 1) {
            System.out.println("Stos jest pełny");
            return;
        }
        this.stack[++this.top] = element;
    }

    public int pop() {
        if (this.top < 0) {
            System.out.println("Stos jest pusty");
            return -1;
        }
        return this.stack[this.top--];
    }
}

