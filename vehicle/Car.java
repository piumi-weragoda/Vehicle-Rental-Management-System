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
enum CarType{LUXURY,ELECTRIC,SPORTS}

public abstract class Car implements Comparable<Car>{
    
    private String model;
    private int carId;
    private float price;
    private CarType type;

    public Car(String model, int carId, float price,CarType type) {
        this.model = model;
        this.carId = carId;
        this.price = price;
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return carId+"CarID" + "Model :" + model + " price=" + price +" Car "+type;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Car)
        {
            Car c =(Car)obj;
            if (carId == c.carId)
                return true;
        }
        return false;
    }
    @Override
    public int compareTo(Car o){
        
        return carId = o.carId;
        
    }
    public abstract void display();
     
    
    
    
    
}
