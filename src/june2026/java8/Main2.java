package june2026.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Abhishek", "IT", 50000),
                new Employee("Ankit", "IT", 70000),
                new Employee("Rahul", "HR", 40000),
                new Employee("Tina", "HR", 45000),
                new Employee("Esha", "Finance", 60000),
                new Employee("Naman", "Finance", 55000),
                new Employee("Sachit", "IT", 80000),
                new Employee("Pushp", "Marketing", 50000),
                new Employee("Sumit", "Marketing", 52000)
        ));

        List<Transaction> transactions = Arrays.asList(
                new Transaction("Food", 100),
                new Transaction("Food", 200),
                new Transaction("Food", 150),
                new Transaction("Shopping", 300),
                new Transaction("Shopping", 250),
                new Transaction("Shopping", 100),
                new Transaction("Utilities", 400),
                new Transaction("Utilities", 300),
                new Transaction("Entertainment", 500),
                new Transaction("Entertainment", 200),
                new Transaction("Travel", 700),
                new Transaction("Travel", 300)
        );


        //Q1: Given a list of integers, remove duplicates and sort them in descending order.
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 3, 2, 5, 4));
        //list.stream().distinct().

        //Q1: Group employee by department
        /*Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(result);*/

        //Q2: Find employees name by department
        /*Map<String, List<String>> result = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(result);*/
    }
}
