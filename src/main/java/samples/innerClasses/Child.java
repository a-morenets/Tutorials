package samples.innerClasses;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Денис
 */
public class Child extends Base { 
int x =20; 
Child() { 
System.out. println("Child constr"); 
show(); 
} 
void show() { 
    System.out.println("Child Show " + this.x +" ");
} 

public static void main( String s[ ] ) { 
    new Child(); 
 	} } 
class Base{ 
int x = 10; 
Base() { 
System.out.println("Base constr"); 
show(); 
} void show() { System.out.println ("Base Show II + x + II "); } }