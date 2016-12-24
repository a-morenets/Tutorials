/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.innerClasses.ua.training.def;

/**
 *
 * @author Денис
 */
public class Runner {

    public static void main(String[] args) {
        Car car = new Car(){

            @Override
            public void move() {
                System.out.println("car is moving speed=" /*+getSpeed()*/);
            }
            
        };
        //car.move();
        car.getSpeed();
        
        Car newCar = () -> { System.out.println("car is moving speed=" );};
        newCar.getSpeed();
    }
    
}
