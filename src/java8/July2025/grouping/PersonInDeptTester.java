package java8.July2025.grouping;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonInDeptTester {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person(1, "Alex", 100d, new Department(1, "HR")),
                new Person(2, "Brian", 200d, new Department(1, "HR")),
                new Person(3, "Charles", 900d, new Department(2, "Finance")),
                new Person(4, "David", 200d, new Department(2, "Finance")),
                new Person(5, "Edward", 200d, new Department(2, "Finance")),
                new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
                new Person(7, "George", 900d, new Department(3, "ADMIN"))
        );

        //need to group all persons by department
       // Map<Department, List<Person>> deptPersonMap = persons.stream().collect(Collectors.groupingBy(Person::department));
       // System.out.println(deptPersonMap);

        //need to count person in each department
        //Map<Department, Long> countMap = persons.stream().collect(Collectors.groupingBy(x->x.department(), Collectors.counting()));
        //countMap.entrySet().stream().forEach(x-> System.out.println("In Department: "+x.getKey().name()+", total number of person are: "+x.getValue()));

        //need to group all person ids by department
        //Map<Department, List<Integer>> map = persons.stream().collect(Collectors.groupingBy(Person::department, Collectors.mapping(Person::id, Collectors.toList())));
        Map<Department, List<Integer>> map = persons.stream().collect(Collectors.groupingBy(Person::department, Collectors.mapping(person->person.id(), Collectors.toList())));
        System.out.println(map);

    }
}
