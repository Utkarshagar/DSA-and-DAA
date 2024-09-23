package java_project.Queue;

public class Queu {
    int[] queue;
    int size;
    int rear;

    public Queu(int size) {
        this.size = size;
        queue = new int[size];
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = val;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1; 
        }
        int val = queue[0];
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        return val;
    }
    
    public static void main(String[] args) {
        Queu q=new Queu();
        System.out.println(q.isEmpty());
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(0);
        System.out.println(q.isFull());
        System.out.println(q.dequeue());
       


    }
}
