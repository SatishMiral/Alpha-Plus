import java.util.*;
public class StackQueueUsingDeque {
    static class Stack{
        Deque<Integer> s = new LinkedList<>();

        public boolean isEmpty(){
            return s.getLast() == null;
        }

        public void push(int data){
            s.addLast(data);
        }

        public int pop(){
            return s.removeLast();
        }

        public int peek(){
            return s.getLast();
        }
    }

    static class Queue {
        Deque<Integer> q = new LinkedList<>();

        public boolean isEmpty(){
            return q.getLast() == null;
        }

        public void add(int data){
            q.addLast(data);
        }

        public int remove(){
            return q.removeFirst();
        }

        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);;
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        // while (!q.isEmpty()) {
        //     System.out.print(q.peek() + " ");
        //     q.remove();
        // }
    }
}