package june2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 90000, "New York"),
                new Employee("Bob", "HR", 60000, "Chicago"),
                new Employee("Charlie", "IT", 85000, "New York"),
                new Employee("David", "HR", 55000, "New York"),
                new Employee("Eve", "Finance", 110000, "Chicago")
        );
        //Q. Concentrate all employee names into a single comma-separated string.
        String names = employees.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(names);

        //Q. join all department names but wrap the final result in brackets.
        /*String departments = employees.stream().map(Employee::getDepartment).collect(Collectors.joining(",", "[", "]"));
        System.out.println(departments);*/
        String departments = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.joining(",", "[", "]"));
        System.out.println(departments);

        //Q. Group employees by department, but instead of the whole Employee object, get a list of just their names.
        /*Map<String, List<Employee>> empByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));
        empByDept.forEach((dept, empList) -> System.out.println(dept+ ": "+empList.stream().map(Employee::getName).toList()));*/
        /*Map<String, List<Employee>> empByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));
        empByDept.forEach((dept, empList) -> System.out.println(dept+": "+empList.stream().map(emp->emp.getName()).toList()));*/
        employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment())).forEach((dept, empList) -> System.out.println(dept + ": " + empList.stream().map(x -> x.getName()).toList()));

        //Q. Group employees by department, but instead of the whole Employee object, get a list of just their names, such that the o/p looks like
        //{Finance=[Eve], HR=[Bob, David]....}
        /*Map<String, List<String>> namesByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.mapping(employee -> employee.getName(), Collectors.toList())));
        System.out.println(namesByDept);*/
        Map<String, List<String>> namesByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.mapping(employee -> employee.getName(), Collectors.toList())));
        System.out.println(namesByDept);

    }
}
