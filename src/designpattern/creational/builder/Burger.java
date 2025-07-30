package designpattern.creational.builder;

public class Burger {
    private final String bunType;
    private final boolean cheese;
    private final String vegNonveg;

    private Burger(Builder builder){
        this.bunType = builder.bunType;
        this.cheese = builder.cheese;
        this.vegNonveg = builder.vegNonveg;
    }



    static class Builder{
        private String bunType;
        private boolean cheese;
        private String vegNonveg;

        public Builder setBunType(String bunType) {
            this.bunType = bunType;
            return this;
        }

        public Builder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setVegNonveg(String vegNonveg) {
            this.vegNonveg = vegNonveg;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }

    }

    @Override
    public String toString() {
        return "Burger{" +
                "bunType='" + bunType + '\'' +
                ", cheese=" + cheese +
                ", vegNonveg='" + vegNonveg + '\'' +
                '}';
    }
}
