package queue;

public class QueueImplUsingArray {
    static int start = -1;
    static int end = -1;
    static int[] queue = new int[1000];
    static int currSize = 0;

    // O(1) time complexity
    static void push(int x){
        if(currSize == 0){
            start = 0;
            end = -1;
        }

            end = (end + 1) % queue.length;
            queue[end] = x;
            currSize = currSize + 1;

    }

    static int pop(){
        if(currSize==0){
            start = -1;
            end = -1;
            System.out.println("Queue is empty");
            return -1;
        }
        int n = queue[start];
        start = (start + 1) % queue.length;
        currSize = currSize -1;
        return n;
    }

    static int top(){
        if(currSize==0) {
            start = -1;
            end = -1;
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[start];
    }

    static int size(){
        if(currSize==0) return 0;
        return currSize;
    }

    public static void main(String[] args) {
        QueueImplUsingArray qu = new QueueImplUsingArray();
        push(10);
        push(20);
        System.out.println(size());
        System.out.println(pop());
        push(30);
        System.out.println(size());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(top());
        push(100);
        System.out.println(top());
        System.out.println(pop());
    }

}
