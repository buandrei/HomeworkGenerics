package SCIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedRepository<T> implements IRepository<T> {

    private Set<T> myTreeSetList = new TreeSet<>();

    @Override
    public void save(T obj) {
        myTreeSetList.add(obj);
    }

    @Override
    public void remove(T obj) {
        myTreeSetList.remove(obj);

    }

    @Override
    public int count() {
        return myTreeSetList.size();
    }

    @Override
    public Set<T> listAll() {
        return myTreeSetList;
    }
}
