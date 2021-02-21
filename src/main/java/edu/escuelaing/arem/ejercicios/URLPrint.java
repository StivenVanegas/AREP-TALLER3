/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ejercicios;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author StivenVanegas
 */
public class URLPrint {
    
    public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("http://www.example.com:80/stiven/index.html?value=HelloWorld#Chapter1");
        
        String protocol = url.getProtocol();
        String authority = url.getAuthority();
        String host = url.getHost();
        int port = url.getPort();
        String path = url.getPath();
        String query = url.getQuery();
        String file = url.getFile();
        String ref = url.getRef();
        System.out.println("Protocol: "+protocol+"\nAuthority: "+authority+"\nHost: "+host+"\nPort: "+port+"\nPath: "+path+"\nQuery: "+query+"\nFile: "+file+"\nRef: "+ref);
    }
  
}
