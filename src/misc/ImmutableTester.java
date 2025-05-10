package misc;

/*
1. First we are testing ImmutableStudent with MutableAge without Deep Copy in the constructor of ImmutableStudent. It will fail.
2. Now we will go to ImmutableStudent and Deep Copy of MutableAge in ImmutableStudent constructor and also in the getter for mutable age
*/

public class ImmutableTester {
    public static void main(String[] args) {
        //mutable age object is being created
        MutableAge age = new MutableAge();
        age.setDay(01);
        age.setMonth(01);
        age.setYear(1982);

        //immutable student object iis being created with mutable age
        ImmutableStudent student = new ImmutableStudent(1, "Abhinav", age);

        System.out.println("Age before modification"+student.getAge().getYear());
        student.getAge().setYear(1992);
        System.out.println("Age after modification: "+student.getAge().getYear());

    }
}
