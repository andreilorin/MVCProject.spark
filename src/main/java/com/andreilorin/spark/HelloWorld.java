package com.andreilorin.spark;

import static spark.Spark.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        staticFiles.location("/public");
        get("/home", (req, res) -> {
             return "Hello World !";
        });
        
        get("/home/login", (req, res) -> {
             return "Login page !";
        });

    }       
}
