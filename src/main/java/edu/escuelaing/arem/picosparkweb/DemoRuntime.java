/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.picosparkweb;

import static edu.escuelaing.arem.picosparkweb.PicoSpark.*;
/**
 *
 * @author StivenVanegas
 */
public class DemoRuntime {
    
    public static void main(String args[]){
        port(getPort());
        get("/hello", "Hello world!"); 
        startServer();
    }

    private static int getPort() {
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}
