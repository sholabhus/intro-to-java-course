package com.cbfacademy.cars;

public class Car {
   

    //create a car class with the following fields

    private String make;
    private String model;
    private String colour;
    private int year;

    //constructor
    public Car(String make,String model, String colour, int year){

     this.make=make;
     this.model=model;
     this.colour=colour;
     this.year=year;
}

 

public String getMake(){
 return this.make;
}

 public String getModel(){
    return this.model;
 }
 public String getColour(){
   return this.colour;
 }

 public int getYear(){
    return this.year;
 }

 public void setColour(String colour){
   this.colour=colour;
 }
 public String getDetails(){
  return String.format( "%s %s %s(%d)", colour,make,model,year);
  }
}

 


      
      
        
    
    

