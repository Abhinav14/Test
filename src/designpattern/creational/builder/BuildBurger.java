package designpattern.creational.builder;

public class BuildBurger {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder().setBunType("multigrain").setCheese(true).setVegNonveg("veg").build();
        System.out.println(burger);
    }
}
