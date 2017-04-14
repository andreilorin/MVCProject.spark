package com.andreilorin.spark;

import static spark.Spark.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        get("/hello", (req, res) -> {
            return "Hello World !";
        });
    }
}
