package designpattern.creational.builder;

public class Name {
    private final String firstName;
    private final String lastName;
    private final String nickName;

    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nickName = builder.nickname;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String nickname;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
