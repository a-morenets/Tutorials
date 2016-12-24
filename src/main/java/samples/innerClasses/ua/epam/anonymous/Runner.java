/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.innerClasses.ua.epam.anonymous;

import java.util.ArrayList;

/**
 *
 * @author Денис
 */
class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double square(){
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}

public class Runner {
     
    public static void main(String[] args) {
        final int aaa[] = {12};
        
        
        Point circle = new Point(3,4){
            int radius = aaa[0];

            @Override
            public double square() {
                return radius * aaa[0] * Math.PI;
            }

            @Override
            public String toString() {
                return super.toString() + "square = "+ square(); //To change body of generated methods, choose Tools | Templates.
            }
            
            
        };
        aaa[0] =-1;
        System.out.println(circle);
        
        ArrayList<Integer> arr = new ArrayList<Integer>(){
            {
                add(3);
                add(4);
                add(5);
            }
        };
        System.out.println(arr);
        
    }
}
