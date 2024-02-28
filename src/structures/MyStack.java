package structures;

/**
 *
 * @author Andres
 */
public class MyStack<T> {

    private Node<T> top;

    public MyStack() {
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.setNext(top);
        top = newNode;

    }

    public T pop() {
        if (top != null) {

            T data = top.getData();
            top = top.getNext();
            return data;
        }
        return null;
    }

    public T peek() {
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

}
