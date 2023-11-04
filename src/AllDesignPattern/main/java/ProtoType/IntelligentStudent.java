package ProtoType;

public class IntelligentStudent extends Student{

    private int iq;

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent(){

    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public int getIq(int i) {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" + super.toString() +
                ",iq=" + iq +
                '}';
    }
}
