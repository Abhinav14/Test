package misc;
//make the class final so that it can't be extended
public class ImmutStudent {
    //make all instance variables final so that they can't be changed once value is assigned to them
    private final int id;
    private final String name;
    private final MutAge age;

    //parameterized constructor
    ImmutStudent(int id, String name, MutAge age){
        this.id = id;
        this.name = name;
        //deep copy MutAge
        MutAge finalAge = new MutAge();
        finalAge.setDay(age.getDay());
        finalAge.setMonth(age.getMonth());
        finalAge.setYear(age.getYear());
        this.age = finalAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //deep copy MutAge
    public MutAge getAge() {
        MutAge finalAge = new MutAge();
        finalAge.setDay(age.getDay());
        finalAge.setMonth(age.getMonth());
        finalAge.setYear(age.getYear());
        return finalAge;
    }
}
