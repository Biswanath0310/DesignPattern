package Builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setName("Ramakanth")
                .setPsp("90.00")
                .setYoe(1)
                .build();
        System.out.println(s);
    }
}
