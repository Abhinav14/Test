package august2025;

public class ContentFactory {
    public static Content getConcreteContent(String str){
        if(str.equals("Article")){
            return new Article();
        }
        if(str.equals("TroubleShooting")){
            return new TroubleShooting();
        }
        return null;
    }
}
