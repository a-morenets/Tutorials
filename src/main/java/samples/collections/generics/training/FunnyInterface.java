package samples.collections.generics.training;

/**
 * Created by Денис on 16.11.2016.
 */
public interface FunnyInterface {
    static void checkEmpty(String param){
        if( param == null || param.isEmpty() ){
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {

    }

}
