package com.cbfacademy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) throws IOException {
 try
    (Socket socket = new Socket( "localhost", 4040);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true)){
       
    String message="Hello World";
     writer.println(message);
       System.out.println("Sent message to server: " + message);
    } catch (IOException e) {
       e.printStackTrace();
}
}
}
