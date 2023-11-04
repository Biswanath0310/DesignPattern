package ProtoType;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,Student> registry;

    public StudentRegistry() {
        registry = new HashMap<>();
    }

    public void save(Student student){
        registry.put(student.getBatchName(),student);
    }

    public Student get(String batchName){
        return registry.get(batchName);
    }
}
