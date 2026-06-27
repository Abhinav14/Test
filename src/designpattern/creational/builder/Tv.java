package designpattern.creational.builder;

public class Tv {
    private final String tbBrand;
    private final String tvName;
    private final String tvSize;

    Tv(Builder builder){
        this.tbBrand = builder.tbBrand;
        this.tvName = builder.tvName;
        this.tvSize = builder.tvSize;
    }

    public static class Builder{
        private String tbBrand;
        private String tvName;
        private String tvSize;

        public Builder setTbBrand(String tbBrand) {
            this.tbBrand = tbBrand;
            return this;
        }

        public Builder setTvName(String tvName) {
            this.tvName = tvName;
            return this;
        }

        public Builder setTvSize(String tvSize) {
            this.tvSize = tvSize;
            return this;
        }

        public Tv build(){
            return new Tv(this);
        }
    }

    @Override
    public String toString() {
        return "Tv{" +
                "tbBrand='" + tbBrand + '\'' +
                ", tvName='" + tvName + '\'' +
                ", tvSize='" + tvSize + '\'' +
                '}';
    }
}
