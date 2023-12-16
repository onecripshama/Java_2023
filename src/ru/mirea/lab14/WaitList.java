package ru.mirea.lab14;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;

    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(ConcurrentLinkedQueue<E> c){
        content = new ConcurrentLinkedQueue<>(c);
    }
    @Override
    public String toString(){
        return "WaitList content= "+content;
    }
    @Override
    public void add(E element) {
        content.add(element);
    }
    @Override
    public E remove(){
        if (isEmpty()) System.out.println("Queue null");
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        for (E item : content) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean containsAll(Collection<E> collection) {
        for (E element : collection) {
            if (!content.contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}