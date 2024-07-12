package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer  {

    public static void main(String[] args) {
  
    try
    (ServerSocket serverSocket = new ServerSocket( 4040))
    {
     System.out.println("listening on port 4040... ");
     while (true) {
        //Accept incoming client connection
        try (Socket clientSocket = serverSocket.accept();
     
     //wrap the inputream in bufferReader
     BufferedReader bf  = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
        //Read and print the message from the client
        String message =bf.readLine();                                                        
        System.out.println("Received message from client " + message);

     }
    }
}catch(IOException e) {
    e.printStackTrace();

    } 
}
}