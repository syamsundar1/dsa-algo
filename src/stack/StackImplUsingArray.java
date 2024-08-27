package stack;

public  class StackImplUsingArray {

    public StackImplUsingArray(){

    }

    static int  top = -1;
    static int[] stack = new int[10000];

    // O(1) - All operations
    public static void push(int x){
        if(top>=10000) System.out.println("Stack is full");
        top = top + 1;
        stack[top] = x;
    }

    public static int pop(){
        if(top==-1) System.out.println("Stack is empty");
        top = top - 1;
        return stack[top];
    }

    public static int top(){
        if(top==-1) return -1;
        return stack[top];
    }

    public static int size(){
        return top+1;
    }


    public static void main(String[] args) {
        StackImplUsingArray st = new StackImplUsingArray();
        push(10);
        push(20);
        push(30);
        System.out.println(size());
        System.out.println(top());
        System.out.println(pop());
        push(40);
        System.out.println(size());
    }

}
