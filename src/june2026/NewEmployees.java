package june2026;

public class NewEmployees {
    private String name;
    private String department;
    private String gender;
    private int age;
    private double salary;

    public NewEmployees(String name, String department, String gender, int age, double salary) {
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
