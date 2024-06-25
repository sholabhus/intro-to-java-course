package com.cbfacademy.shapes;

public class Main {
    public static void main(String[] arg){
         final double coverage=40.0;
        

//Shape
Rectangle deck = new Rectangle(35, 20);
Sphere ball =new Sphere(15);
Cylinder tank = new Cylinder(10,30);

// create paint object
Paint paint = new Paint(coverage);

//calcuate the total needed for each shape
double paintForDeck = paint.getAmount(deck);
double paintForBall = paint.getAmount(ball);
double paintFortank = paint.getAmount(tank);

//calculating the total amount for all item
double TotalAmount = paintForDeck + paintForBall +paintFortank;



//print the amount of paint needed for each item
System.out.println("Amount needed to paint the " + deck.name + ":" + paintForDeck);
System.out.println("Amount needed to paint the " + ball.name + ":" + paintForBall);
System.out.println("Amount needed to paint the " + tank.name + ":" + paintFortank);
//print the amount of paint needed for  All item
System.out.println("Total amount of paint needed: " + TotalAmount);

 }

    
}
