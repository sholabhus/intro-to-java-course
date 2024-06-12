package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        //Create an empty linked list
        LinkedList<Integer>integers =new LinkedList<>();
        // add 4 as the first element
        integers.add(4);
        //then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        // add another 2 as the last element of the list
        integers.add(2);
        //add 4 as the 3rd element of the list
        integers.add(2,4);
        // .element() is used to retrieve the FIRST element of the list
        System.out.print(integers.element());
        //retutn integers
        return integers;
    }
   

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        //throw new RuntimeException("Not implemented");
        //create an empty stack
        Stack<Integer>integers =new Stack<>();
        //Add elements to the stack using push
        integers.push(5);
        integers.push(6);
        integers.push(8);
        integers.push(9);
        //print the first element of the stack
      System.out.print(integers.elementAt(0));
      //print last element of the stack
      System.out.print(integers.lastElement());
      //invoke the pop() method on the stack and print the result
      System.out.print(integers.pop());
      //invoke the push(4)method on the stack 
      integers.push(4);
      //return integers
      return integers;

}

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        //throw new RuntimeException("Not implemented");
       // create an empty arrayDeque
        ArrayDeque<Integer>integers = new ArrayDeque<>();
        //add 5, 6, 8, 9 to the queue
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
        //print the first element of the queue on the screen
        System.out.print(integers.getFirst());
        //print the last element of the queue on the screen
        System.out.print(integers.getLast());
       // invoke the method poll() on the queue and print the result on the screen
        System.out.print(integers.poll());
        //invoke the element() method on the queue and print the result on the screen
        System.out.print(integers.element());
        //return queue
        return integers;


    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
       // throw new RuntimeException("Not implemented");
       //create an empty hash map
    HashMap<Integer,String>language= new HashMap<>();
    //add entries
    language.put(1, "TypeScript");
    language.put(2, "Kotlin");
    language.put(3, "Python");
    language.put(4, "Java");
    language.put(5, "JavaScript");
    language.put(6, "Rust");
    //print set of keys from the map
    System.out.print(language.keySet());
    //print set of values from the Map
    System.out.print(language.values());
    //determine whether the map contains "English" as a language and print the result on the screen
    System.out.print(language.containsValue("English"));
    //return the map
    return language;
    
    }

    public String getName() {
        return "Collections Exercises";
    }
}
