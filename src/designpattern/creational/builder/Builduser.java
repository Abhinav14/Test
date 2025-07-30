package designpattern.creational.builder;

public class Builduser {
    public static void main(String[] args) {
        User user = new User.Builder().setUserId(12345L).setFirstName("Abhinav").setLastName("Anant").setEmail("abhinav@gmail.com").setAge(42).build();

        System.out.println(user.toString());
    }
}
