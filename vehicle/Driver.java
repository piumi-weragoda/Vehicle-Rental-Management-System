/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Driver {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(CarFactory.getCarInstance("BMW", 1001, 5000000.00f, CarType.LUXURY));
        carList.add(CarFactory.getCarInstance("Toyota", 1002, 5200000.00f, CarType.SPORTS));
        carList.add(CarFactory.getCarInstance("Nissan", 1003, 6070000.00f, CarType.ELECTRIC));

        Scanner scn = new Scanner(System.in);
        int opt = 1;
        do {
            System.out.println("1 - Display cars");
            System.out.println("2 - Search cars");
            System.out.println("3 - Sort cars by Id");
            System.out.println("4 - Sort cars by price");
            System.out.println("5 - Add new cars");
            System.out.println("6 - Edit car details");
            System.out.println("7 - Remove a cars");
            System.out.println("8 - Exit");
            System.out.println("Option :");

            opt = scn.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("You have selected option 1 - Display Cars");
                    for (Car c : carList) {
                        System.out.println(c);
                    }
                    break;

                case 2:
                    int index = -1,
                     id;
                    System.out.println("You have selected option 2 - Search Cars");
                    System.out.println("Car ID : >>");
                    id = scn.nextInt();
                    for (int i = 0; i < carList.size(); i++) {
                        if (id == carList.get(i).getCarId()) {
                            index = i;
                            break;
                        }
                        if (index != -1) {
                            System.out.println("Car found : " + carList.get(index));

                        } else {
                            System.out.println("Car not Found... : ");
                        }
                        break;
                    }
                case 3:

                    System.out.println("You have selected option 3- sort by car ID ");
                    Collections.sort(carList);
                    for(Car c: carList)
                        System.out.println(c);
                    break;
                    
                case 4:
                    System.out.println("You have selected option 4- sort by car with price ");
                    Collections.sort(carList,new SortByPrice());
                    for(Car c:carList)
                        System.out.println(c);
                    break;
                case 5:
                    System.out.println("You have selected option 5- Add a new car");
                    System.out.println("Car ID :>>");
                    id = scn.nextInt();
                    System.out.println("Car Price :");
                    float price = scn.nextFloat();
                    System.out.println("Car Model :");
                    String model = scn.next();
                    System.out.println("Car Type: >>\n Elcetric -1\nSport-2\nLuxury-3");
                    int typ = scn.nextInt();
                    
                    switch(typ)
                    {
                        case 1: carList.add(CarFactory.getCarInstance(model, id, price, CarType.LUXURY));break;
                        
                        case 2: carList.add(CarFactory.getCarInstance(model, id, price, CarType.LUXURY));break;
                        case 3: carList.add(CarFactory.getCarInstance(model, id, price, CarType.LUXURY));break;
                        default : System.out.println("Invalid car type");
                        
                    }
                    System.out.println("car ID :"+id +"Added.");
                    break;
                        
                    

            }

        } while (opt != 9);

    }

}
//run wenne nane boo hriii :) ynna mage lap eken pala
//boo ada katha kalnna wenne nadda
////na puluwn keeyatada
//ada cln iwr una quiz ekk wtri tbbe
//ammata patta neboo
//dan bayyan lasthi
//oky gannam kaddibutttburr 