package algorithm;

import java.util.Stack;

public class StackQueue {
    static class Queue<T> {
        Stack<T> enQueueStack;
        Stack<T> deQueueStack;

        Queue() {
            this.enQueueStack = new Stack<T>();
            this.deQueueStack = new Stack<T>();
        }

        void enQueue(T value) {
            enQueueStack.add(value);
        }

        T deQueue() {
            if (deQueueStack.isEmpty()) {
                while (!enQueueStack.isEmpty()) {
                    deQueueStack.add(enQueueStack.pop());
                }
            }
            return deQueueStack.pop();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
