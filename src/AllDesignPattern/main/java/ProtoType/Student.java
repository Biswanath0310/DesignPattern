package ProtoType;

public class Student implements Prototype<Student>{
    private String name;
    private int rollNumber;
    private String batchName; // Common for all student int a batch
    private String avgBatchPsp; // Common for all student int a batch
    private String instructor; // Common for all student int a batch

    public Student(Student student) {
        this.batchName = student.batchName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.instructor = student.instructor;
    }

    public Student(){

    }
    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgBatchPsp(String avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getAvgBatchPsp(String s) {
        return avgBatchPsp;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", batchName='" + batchName + '\'' +
                ", avgBatchPsp='" + avgBatchPsp + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}


