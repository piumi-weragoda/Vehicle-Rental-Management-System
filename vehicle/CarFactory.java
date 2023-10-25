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
public class CarFactory {
    
    public static Car getCarInstance(String model, int carId, float price,CarType type){
        
        switch(type)
        {
            case LUXURY: return new LuxuryCars(model,carId,price,type);
            case SPORTS: return new SportsCars(model,carId,price,type);
            default: return new ElectricCars(model,carId,price,type);
            
        }
    }
    
}
