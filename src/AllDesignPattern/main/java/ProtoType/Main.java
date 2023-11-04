package ProtoType;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        Student marBatch = new Student();
        marBatch.setBatchName("March2023");
        marBatch.setAvgBatchPsp("80");
        marBatch.setInstructor("Varun");

        Student aprilBatch = new Student();
        aprilBatch.setBatchName("April2023");
        aprilBatch.setAvgBatchPsp("85");
        aprilBatch.setInstructor("Biswanath");

        /*
            Registry Design pattern
        */

        //Save object inside student registry
        registry.save(marBatch);
        registry.save(aprilBatch);

        // Create object by getting prototype of certain batch from registry
        //March Batch student creation
        Student satvika = registry.get("March2023");
        satvika.setName("SATVIKA");
        satvika.setRollNumber(52);

        //April Batch student creation
        Student advik = registry.get("April2023");
        advik.setName("ADVIK");
        advik.setRollNumber(01);

        /*
           Prototype design pattern
        */
        //First create prototype object
        IntelligentStudent superbatch2023 = new IntelligentStudent();
        superbatch2023.setBatchName("Super2023");
        superbatch2023.setAvgBatchPsp("100");
        superbatch2023.setInstructor("Manisha");

        //Create new object by using clone method of prototype object
        IntelligentStudent biswanath = superbatch2023.clone();
        biswanath.getIq(100);
        biswanath.setName("June2023");
        biswanath.setRollNumber(42);

        System.out.println(satvika);
        System.out.println(advik);
        System.out.println(biswanath);
    }
}
