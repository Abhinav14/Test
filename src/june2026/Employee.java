package june2026;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String city;

    public Employee(String name, String department, double salary, String city) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
