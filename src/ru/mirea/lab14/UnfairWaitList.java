package ru.mirea.lab14;
import java.util.Iterator;

public class UnfairWaitList <E> extends WaitList<E> {
    public UnfairWaitList(){
        super();
    }
    public void remove(E element) {
        Iterator<E> iterator = content.iterator();
        while (iterator.hasNext()) {
            E current = iterator.next();
            if (current.equals(element)) {
                iterator.remove();
                return;
            }
        }
    }
    public void moveToBack(E element) {
        if (content.contains(element)) {
            content.remove(element);
            content.add(element);
        }
    }
}