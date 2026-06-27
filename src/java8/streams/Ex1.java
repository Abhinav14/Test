package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(50);
        arrList.add(15);
        arrList.add(25);

        //1.
        /*List<Integer> resultList = arrList.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(resultList);*/
        //2.
        //arrList.stream().map(x -> x*x).forEach(y -> System.out.println(y));
        //3. count()
        /*Stream<Integer> openStream = arrList.stream();
        Stream<Integer> filteredStream = openStream.filter(x->x>=20);
        long streamCount = filteredStream.count();
        System.out.println(streamCount);
        long count = arrList.stream().filter(y -> y >= 20).count();
        System.out.println(count);*/
        //4. sorted() - ascending
        //arrList.stream().sorted().forEach(x-> System.out.println(x));
        //5. sorted() - descending - need comparator
        /*arrList.stream().sorted((i1, i2) -> i1.compareTo(i2)).forEach(x -> System.out.println(x));
        arrList.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(x -> System.out.println(x));*/
        //6. min
        /*Integer i = arrList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(i);*/
        //7. max()
        /*Integer i = arrList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(i);*/
        //8. Array
        /*String[] strArr = {"Apple", "Mango", "Banana"};
        Stream.of(strArr).forEach(x -> System.out.println(x));*/
        //9. peek()
        //arrList.stream().filter(x -> x % 5 == 0).peek(y -> System.out.println(y)).map(x -> x*x).filter(z -> z > 500).forEach(m -> System.out.println(m));
        //10. reduce()
        /*Integer i = arrList.stream().reduce((a, b) -> a+b).get();
        System.out.println(i);*/

        //11. limit()
        List<Employee> employeeList = new ArrayList<>();

        // Adding 10 employee instances to the list
        employeeList.add(new Employee(101, "Abhinav", "EMP001"));
        employeeList.add(new Employee(102, "Amit", "EMP002"));
        employeeList.add(new Employee(103, "Priya", "EMP003"));
        employeeList.add(new Employee(104, "Rahul", "EMP004"));
        employeeList.add(new Employee(105, "Sneha", "EMP005"));
        employeeList.add(new Employee(106, "Vikram", "EMP006"));
        employeeList.add(new Employee(107, "Rohan", "EMP007"));
        employeeList.add(new Employee(108, "Anjali", "EMP008"));
        employeeList.add(new Employee(109, "Karan", "EMP009"));
        employeeList.add(new Employee(110, "Pooja", "EMP010"));

        //employeeList.stream().limit(3).forEach(x -> System.out.println(x));
        //sort by id in descending and limit
        //employeeList.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).limit(3).forEach(x -> System.out.println(x));
        //sort by name in descending and limit 3
        //employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).limit(3).forEach(emp -> System.out.println(emp));
        //employeeList.stream().sorted((emp1, emp2) -> emp2.getName().compareTo(emp1.getName())).limit(3).forEach(emp -> System.out.println(emp));
        //12. findFirst()
        //Employee employee = employeeList.stream().findFirst().get();
        /*Employee employee = employeeList.stream().filter(emp -> emp.getName() == "Abhinav").findFirst().get();
        System.out.println(employee.getName());*/
        //13. stream and parallelStream
        /*employeeList.stream().forEach(x -> System.out.println(x));
        System.out.println("======================================================");
        employeeList.parallelStream().forEach(y -> System.out.println(y));*/
        //14. map()
        List<Integer> list = employeeList.stream().map(emp -> emp.getId()).toList();
        System.out.println(list);


    }
}
