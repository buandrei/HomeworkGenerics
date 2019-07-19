package SCIT;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedRepository<T> implements IRepository<T> {

    private Set<T> myLinkedList = new LinkedHashSet<>();

    @Override
    public void save(T obj) {
        myLinkedList.add(obj);
    }

    @Override
    public void remove(T obj) {
        myLinkedList.remove(obj);
    }

    @Override
    public int count() {
        return myLinkedList.size();
    }

    @Override
    public Set<T> listAll() {
            return myLinkedList;
    }
}
