package Builder;

public class Student {

    private int id;
    private int yoe;
    private String name;
    private String psp;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.psp = builder.psp;
        this.yoe = builder.yoe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(String psp) {
        this.psp = psp;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", yoe=" + yoe +
                ", name='" + name + '\'' +
                ", psp='" + psp + '\'' +
                '}';
    }

    static class Builder{
        private int id;
        private int yoe;
        private String name;
        private String psp;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPsp(String psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            this.validate();
            Student student = new Student(this);
            return student;
        }
        private void validate(){
            if(name == null){
                throw new RuntimeException("Name should not be null");
            }
            if(yoe < 1){
                throw new RuntimeException("Year of experience should be more than 1 year");
            }
        }
    }
}
