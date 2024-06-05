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
        LinkedList<Integer>integers =new LinkedList<>();
       integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(2,4);
        System.out.print(integers.element());
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
        Stack<Integer>integers =new Stack<>();
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
      System.out.print(integers.elementAt(0));
      System.out.print(integers.elementAt(4));
      System.out.print(integers.pop());
      System.out.print(integers.push(4));
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

        ArrayDeque<Integer>integers = new ArrayDeque<>();
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
        System.out.print(integers.getFirst());
        System.out.print(integers.getLast());
        System.out.print(integers.poll());
        System.out.print(integers.element());
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
    HashMap<Integer,String>language= new HashMap<>();
    language.put(1, "TypeScript");
    language.put(2, "Kotlin");
    language.put(3, "Python");
    language.put(4, "Java");
    language.put(5, "JavaScript");
    language.put(6, "Rust");
    System.out.print(language.keySet());
    System.out.print(language.values());
    System.out.print(language.containsValue("English"));
    return language;
    
    }

    public String getName() {
        return "Collections Exercises";
    }
}
