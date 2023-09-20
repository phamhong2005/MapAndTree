package manager;

import java.util.HashMap;

public interface IManager <E>{
    void add(E e);
    void remove (int id);
    void update( E e);
    HashMap<Integer ,E > getAll();
}
