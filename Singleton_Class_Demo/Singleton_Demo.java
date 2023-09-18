public class Singleton_Demo {
    private Singleton_Demo() {
        System.out.println("Hello World");
    }

    private static Singleton_Demo instance;
    public static Singleton_Demo getInstance(){
        if (instance==null){
            instance=new Singleton_Demo();
        }
        return instance;
    }
}
