package august2025;


//You need to follow below points to make your class immutable
//1. make your class final
//2. make all your instance variables private and final
//3. Keep only getters to access those data members or instance variables
//4. Create a parameterized constructor which should initialize all the fields performing a deep copy.
public final class ImmutableStudent {
    private final int rollNumber;
    private final String name;
    private final MutableAge age;

    public ImmutableStudent(int rollNumber, String name, MutableAge age){
        this.rollNumber = rollNumber;
        this.name = name;
        //deep copy
        MutableAge immutableAge = new MutableAge();
        immutableAge.setDay(age.getDay());
        immutableAge.setMonth(age.getMonth());
        immutableAge.setYear(age.getYear());
        this.age = immutableAge;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public MutableAge getAge() {
        MutableAge immutableAge = new MutableAge();
        immutableAge.setDay(age.getDay());
        immutableAge.setMonth(age.getMonth());
        immutableAge.setYear(age.getYear());
        return immutableAge;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
