package august2025;

public class ImmutableStudentTester {
    public static void main(String[] args) {
        MutableAge age = new MutableAge();
        age.setDay(01);
        age.setMonth(01);
        age.setYear(1990);
        ImmutableStudent immutableStudent = new ImmutableStudent(1, "John", age);

        System.out.println("Age before modification: "+immutableStudent.getAge());
        immutableStudent.getAge().setYear(1985);
        System.out.println("Age after modification: "+ immutableStudent.getAge());
    }
}
