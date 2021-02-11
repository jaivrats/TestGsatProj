package com.gsat.test;

import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

/**
 * Hello world!
 *
 */
public class App 
{
    
    private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    public static void main( String[] args )
    {
        
        System.out.println( "Hello World!" );
        LOGGER.log(Level.INFO, "My first Log Message"); 
    }
}
