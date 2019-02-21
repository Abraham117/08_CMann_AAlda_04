package src;

public class MyStack<T> extends MyList<T>
{

    public MyStack() {
        size = 0;
        head = tail = null;
    }

    public void push(T obj) {
        insert(obj, 0);
    }

    public T pop() {
        return remove(0);
    }

    public T top() {
        if (getSize() == 0)
            System.out.println("Stack empty");
        return head.data;
    }
}
