package samples.collections.generics.epam;

/**
 * Created by Денис on 14.11.2016.
 */
public class LazySingleton {
    private static volatile  LazySingleton ourInstance ;
    private boolean isReady ;

    public static LazySingleton getInstance() {
        if( ourInstance == null ){
            synchronized (LazySingleton.class){
                if( ourInstance == null ) {
                   ourInstance = new LazySingleton();
                }
            }
        }
        return ourInstance;
    }

    private LazySingleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isReady = true;
    }

    @Override
    public String toString() {
        return "LazySingleton{" +
                "isReady=" + isReady +
                '}';
    }

    public static void main(String[] args) {
        Runnable anonym = new Runnable(){

            @Override
            public void run() {
                System.out.println("Anonymous class");
            }
        };
        Runnable cons = System.out::println;

        Runnable r = () -> System.out.println("lambda");/* {
            if(!LazySingleton.getInstance().isReady )
            System.out.println(false);
        };*/
        for(int i = 0; i< 500; i++){
            new Thread(r).start();
        }
        System.out.println("all ok");


    }
}
