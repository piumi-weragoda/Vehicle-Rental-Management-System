/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author lenovo
 */
public class LuxuryCars extends Car{

    public LuxuryCars(String model, int carId, float price, CarType type) {
        super(model, carId, price, type);
    }

public void display(){
    System.out.println("Luxury Car..");
}
    
}
