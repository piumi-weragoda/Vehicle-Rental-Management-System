/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class SortByPrice implements Comparator<Car>{
    
 public int compare(Car o1, Car o2) {
     
     return (int)(o2.getPrice()-o1.getPrice());
 }  
    
}
