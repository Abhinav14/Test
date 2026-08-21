package june2026.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Q1: Given a list of integers, remove duplicates and sort them in descending order.
        /*List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 3, 2, 5, 4));
        List<Integer> result = list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result);*/

        //Q2: From a list of integers, find all the odd numbers and return their squares.
        /*List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result = list.stream().filter(x -> x % 2 != 0).map(y -> y * y).toList();
        System.out.println(result);*/

        //Q3: We have a list of Integers. Get 2nd and 3rd elements from it and return them in a list.
       /* List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result = list.stream().skip(1).limit(2).toList();
        System.out.println(result);*/

        //Q4: We have a list of Integers. Find the second highest number in a list.
        /*List<Integer> list = new ArrayList<>(Arrays.asList(20, 10, 10, 45, 30, 45, 5, 20));
        Optional<Integer> var = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(var.isPresent()){
            System.out.println(var);
        }*/

        //Q5: You have a list of Integers. Divide numbers into even and odd.
        /*List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5));
        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(result);*/

        //Q6: We have a list of Strings. Find the longest string in the list.
        /*List<String> list = new ArrayList<>(Arrays.asList("Java", "SpringBoot", "API"));
        Optional<String> var = list.stream().max(Comparator.comparing(x -> x.length()));
        if(var.isPresent()){
            System.out.println(var.get());
        }*/

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

        //Q7: From a list of Employees, find the first employee whose salary s greater than 500000.
       /* Optional<Employee> first = employees.stream().filter(e -> e.getSalary() > 50000).findFirst();
        if(first.isPresent()){
            System.out.println(first.get());
        }*/

        //Q8: From a list of employees, find the top 2 highest paid employees.
        /*List<Employee> empList = employees.stream().sorted(Comparator.comparing(e -> -1 * e.getSalary())).limit(2).toList();
        System.out.println(empList);*/

        //Q9: From a list of employees, sort employees by salary, then by name.
        /*List<Employee> employeeList = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).toList();
        System.out.println(employeeList);*/

        //Q10: From a list of Integer, find the frequency of each element.
        /*List<Integer> list = Arrays.asList(3, 2, 3, 4, 4, 1, 2, 1, 1, 1, 5, 6, 5);
        Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(elem -> elem, Collectors.counting()));
        System.out.println(result);*/

        //Q11: Given a list of employees, count how many employees are in each department.
        /*Map<String, Long> result = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));
        System.out.println(result);*/

        //Q12: Given a list of transactions, find total transaction amount per category.
        /*Map<String, Integer> result = transactions.stream().collect(Collectors.groupingBy(trans -> trans.getCategory(), Collectors.summingInt(trans -> trans.getAmount())));
        System.out.println(result);*/

        //Q13: Given a list of employees, find the average salary of employees in each department.
        /*Map<String, Double> result = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.averagingInt(emp -> emp.getSalary())));
        System.out.println(result);*/

        //Q14: Given a list of employees, find the highest paid employee in each department.
        /*Map<String, Optional<Employee>> result = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(result);*/

        //Q15: Given a list of employees, convert the list into a comma-separated string of employee names.
        /*String result = employees.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(result);*/

        //Q16: Given two lists, find the common elements between them.
        /*List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 4, 3);
        List<Integer> result = list1.stream().filter(elem -> list2.contains(elem)).toList();
        System.out.println(result);
        Set<Integer> set = new HashSet<>(list1);
        List<Integer> result2 = list2.stream().filter(x -> set.contains(x)).toList();
        System.out.println(result2);*/

        //Q17: You have list of lists. Convert it into a single list with all the elements. Remove duplicates if any.
        /*List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(3, 4, 5, 6),
                Arrays.asList(7, 8, 1, 2),
                Arrays.asList(9, 10, 5, 6),
                Arrays.asList(11, 12, 7, 8)
        );
        List<Integer> result = listOfLists.stream().flatMap(innerList -> innerList.stream()).distinct().toList();
        System.out.println(result);*/

        //Q18: Given a list of employees, print all employees names. Their order doesn't matter but the operation should be very fast.
        //employees.stream().forEach(emp -> System.out.println(emp.getName()));
        /*employees.parallelStream().forEach(emp -> System.out.println(emp.getName()));*/

        //Q19: What will be the error in below code?
        //List<Integer> list = new ArrayList<>();


        //Q20: From a list of employees, compute total combined salary of all employees. Operation should be very fast.(means parallel)
        /*int result = employees.parallelStream().collect(Collectors.summingInt(Employee::getSalary)).intValue();
        System.out.println(result);*/
    }
}
