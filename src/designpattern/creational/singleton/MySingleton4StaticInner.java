package designpattern.creational.singleton;

//No need fr synchronized keyword
public class MySingleton4StaticInner {

    private MySingleton4StaticInner(){}

    private static class Holder{
        private static final MySingleton4StaticInner INSTANCE = new MySingleton4StaticInner();
    }

    public static MySingleton4StaticInner getInstance(){
        return Holder.INSTANCE;
    }

}

//What happens here, the instance will be created only once when the inner static class is loaded, when getInstance() is called.
//The INSTANCE will be created once and only once and the same instance will be returned whenever requested.
