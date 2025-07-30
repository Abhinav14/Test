package designpattern.creational.builder;

public class Laptop {
    private final String brand;
    private final String ram;
    private final String discSpace;
    private final String screenSize;

    Laptop(Builder builder){
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.discSpace = builder.discSpace;
        this.screenSize = builder.screenSize;
    }

    public static class Builder{
        private String brand;
        private String ram;
        private String discSpace;
        private String screenSize;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setDiscSpace(String discSpace) {
            this.discSpace = discSpace;
            return this;
        }

        public Builder setScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Laptop build(){
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram='" + ram + '\'' +
                ", discSpace='" + discSpace + '\'' +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
