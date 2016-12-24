/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.innerClasses.ua.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Денис
 */
public class LocalRunner {

    public static void main(String[] args) {
        boolean increaseing = true;
        
        List<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("bb");
        list.add("a");
        
        class LocalComparator implements Comparator<String>{
            boolean increasing;

            public LocalComparator(boolean increasing) {
                this.increasing = increasing;
            }
            
            @Override
            public int compare(String o1, String o2) {
               return (increasing ? 1 : -1) * o1.compareTo(o2);
            }
            
            
        }
        list.sort(new LocalComparator(true));
        System.out.println(list);
        list.sort(new LocalComparator(false));
        System.out.println(list);
        
        list.sort(new Comparator<String>(){
            int iii = 100500; 
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
            
        });
            int iii = 100500; 
        list.sort( (obj1 , obj2) -> (obj2.length() - obj1.length())*iii  );
        
    }
    
}
