package samples.reflection;

import java.lang.reflect.Method;

/**
 * Created by Денис on 07.11.2016.
 */
public class ReflectionRunner {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("Point");
        Object instance = (Point) clazz.newInstance(); // new ua.training.Line()

        for(Method m : clazz.getMethods()) {
            System.out.println( m.getName() );
            if( m.getName().startsWith("get")){
                System.out.println( m.invoke( instance ) );
            } else if( m.isAnnotationPresent( Override.class ) ){
                System.out.println( m.invoke( instance ));
            }
            MyCoolAnnotation cool = m.getAnnotation(MyCoolAnnotation.class);
            if( cool != null && cool.enabled() ){
                System.out.println("Call by " + MyCoolAnnotation.class.getName() +
                                    m.invoke( instance ));
            }
        }
    }
}
