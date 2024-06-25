package com;

import java.util.List;

import com.cbfacademy.Showroom;
import com.cbfacademy.cars.Car;

public class App {
    public static void main(String[] args) {

        Showroom showroom =new Showroom();

   // Call getCars() to get the list of Car objects
    List<Car> cars=showroom.getCars();
    
// Print the details of each Car in the list
        for (Car car : cars) {
            System.out.println(car.toString());

}
    }
}