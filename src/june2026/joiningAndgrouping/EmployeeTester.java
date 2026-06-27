package june2026.joiningAndgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Liam O'Connor", "IT", "Male", 28, 88000.00));
        employees.add(new Employee("Aisha Rahman", "IT", "Female", 31, 95500.00));
        employees.add(new Employee("Carlos Mendez", "IT", "Male", 25, 72000.00));
        employees.add(new Employee("Chloe Zhao", "IT", "Female", 35, 112000.00));

// Finance Department
        employees.add(new Employee("David Kim", "Finance", "Male", 41, 98000.00));
        employees.add(new Employee("Emma Watson", "Finance", "Female", 29, 74500.00));
        employees.add(new Employee("Arjun Nair", "Finance", "Male", 38, 105000.00));

// HR Department
        employees.add(new Employee("Elena Rostova", "HR", "Female", 27, 61000.00));
        employees.add(new Employee("Jordan Smith", "HR", "Non-binary", 33, 68500.00));
        employees.add(new Employee("Marcus Vance", "HR", "Male", 45, 82000.00));

        /*Map<String, Employee> topPerDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get)));

        topPerDept.entrySet().stream().forEach(entry -> System.out.println("Department: "+entry.getKey()+", Top Earner: "+entry.getValue().getName()));*/
        //Q: Employee names per department
        /*Map<String, List<String>> namesByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        namesByDept.entrySet().stream().forEach(entry -> System.out.println("Department: "+entry.getKey()+", Employees: "+entry.getValue()));*/
        //employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList()))).entrySet().stream().forEach(entry -> System.out.println("Department: "+entry.getKey()+", Employees: "+entry.getValue()));

        //Q: Group employees by department and then by gender
        Map<String, Map<String, List<Employee>>> nested = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));

        nested.entrySet().stream().forEach(entry -> {
            System.out.println("Department: "+entry.getKey());
            entry.getValue().entrySet().stream().forEach(val -> {
                System.out.println("Gender: "+val.getKey());
                val.getValue().stream().forEach(emp -> System.out.println(" -"+emp.getName()));
            });
        });


    }
}
