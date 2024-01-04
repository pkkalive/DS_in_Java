package GeeksForGeeks;
public class Stack {
    private final int[] data;
    private int size;
    private int capacity;
    public Stack(int N){
        this.data = new int[N];
        this.size = -1;
        this.capacity = N;
    }
    public void push(int item){
        if (this.capacity > 0) {
            this.size++;
            this.data[this.size] = item;
            this.capacity--;
        } else {
            System.out.println("No Capacity");
        }
    }
    public int pop(){
        if (this.size >=  0) {
            int result = this.data[this.size];
            this.capacity++;
            this.size--;
            return result;
        }
        return -1;
    }
    public boolean isEmpty(){
        return this.size == -1;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSize() {
        return this.size + 1;
    }

    public void print(){
        for (int num: this.data){
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

class MyStack {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.print();
        System.out.println(stack.pop());
        stack.push(30);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.getCapacity());
        System.out.println(stack.getSize());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.print();
        System.out.println(stack.getCapacity());
        System.out.println(stack.getSize());
        stack.push(110);
    }
}


