package misc;

public class ImmutStudentTester {
    public static void main(String[] args) {
        MutAge age = new MutAge();
        age.setDay(10);
        age.setMonth(11);
        age.setYear(2012);

        ImmutStudent student = new ImmutStudent(1, "Rohit", age);

        System.out.println("Age before modification: "+student.getAge().getYear());
        student.getAge().setYear(2013);
        System.out.println("Age after modification: "+student.getAge().getYear());
    }
}
