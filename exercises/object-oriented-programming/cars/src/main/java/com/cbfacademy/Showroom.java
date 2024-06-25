package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

import com.cbfacademy.cars.Car;

public class Showroom {

    public static  List<Car> cars;
    public Showroom (){

        cars =new ArrayList<>();

        //Adding cars to the list
        cars.add(new Car("blue", "Volvo V40", null, 2012));
        cars.add(new Car("red", "Porsche Panamera", null, 2009));
        cars.add(new Car("grey", "Audi A3", null, 2018));
        
    }
    public static List<Car> getCars() {
        return cars;

    }
    
}
