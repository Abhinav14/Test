package designpattern.creational.builder;

public class BuildLaptop {
    public static void main(String[] args) {
        Laptop thinkPad = new Laptop.Builder().setBrand("Lenovo").setRam("16GB").setDiscSpace("1TB").setScreenSize("14 Inches").build();
        System.out.println(thinkPad);
    }
}
