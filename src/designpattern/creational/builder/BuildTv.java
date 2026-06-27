package designpattern.creational.builder;

public class BuildTv {
    public static void main(String[] args) {
        Tv tv = new Tv.Builder().setTbBrand("Sony").setTvName("Bravia").setTvSize("65 inches").build();
        System.out.println(tv);
    }
}
