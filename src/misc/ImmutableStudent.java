package misc;

/*
1. First we will make ImmutableStudent partial immutable as we are not Deep Copying mutable age inside constructor -
- make the class final so that no other class can extend it and play around with instance variables
- make all instance variables final so that it can't be changedonce value is assigned to it.
- create a parameterized constructor which will take the instance variables as arguments to construct object of the class.
- remove all setters and keep only getters to access those instance variables.
2. Once you tested without deep copy of, now test with deep copy of age inside constructor and also inside getter for mutable age
*/
public final class ImmutableStudent {
    private final int id;
    private final String name;
    private final MutableAge age;

    //1. it was for step 1, without Deep Copy. Commenting after breaking Immutability.
    /*public ImmutableStudent(int id, String name, MutableAge age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }*/

    //2. Deep copy of mutable abject Age.
    public ImmutableStudent(int id, String name, MutableAge age){
        this.id = id;
        this.name = name;
        //deep copy
        MutableAge finalAge = new MutableAge();
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

    public MutableAge getAge() {
        MutableAge finalAge = new MutableAge();
        finalAge.setDay(age.getDay());
        finalAge.setMonth(age.getMonth());
        finalAge.setYear(age.getYear());
        return finalAge;
    }
}
