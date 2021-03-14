package code;

public class Application {
    public static void main(String[] args) {
        Database example=new Database("1","2","2");
        boolean result=example.stmt("insert int example values(1,2)");
        System.out.println(result);
    }
}
