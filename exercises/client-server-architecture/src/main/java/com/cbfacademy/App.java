package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class App {
    public static void main(String[] args) {
        System.out.println();
        try {
       //create the URL from URI
        URL url =new URI("https://codingblackfemale").toURL();
        //open connection
        HttpURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        //Read the response   
        try
        (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
        String inputLine;
        while((inputLine =in.readLine()) !=null){
            System.out.println(inputLine);
        }
        //close the connection
        connection.disconnect();
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
   // }
}
}