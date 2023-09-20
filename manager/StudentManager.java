package manager;

import model.Student;

import java.util.HashMap;

public class StudentManager implements IManager<Student>{
    HashMap<Integer,Student> listMap;
    public StudentManager(){
        this.listMap = new HashMap<>();
    }
    @Override
    public void add(Student student) {
        listMap.put(student.getId(), student);
    }

    @Override
    public void remove(int id) {
        listMap.remove(id);
    }

    @Override
    public void update( Student student) {
            listMap.put(student.getId(),student);
    }

    @Override
    public HashMap<Integer, Student> getAll() {
        return listMap;
    }
}
