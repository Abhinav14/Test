package designpattern.creational.builder;

public class BuildName {
    public static void main(String[] args) {
        Name name = new Name.Builder().setFirstName("Abhinav").setLastName("Anant").build();
        System.out.println(name.toString());
    }
}
