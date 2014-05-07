/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_Mensch;

/**
 *
 * @author Vincent McCawk
 */
public class Main {
    
    
    public static void main(String [] args){
        
        Mensch Swagger = new Mensch("Money", "Boy", (short)100);
        Swagger.Status();
        
        Swagger = new Student("Money", "Boy", (short) 100, 1310653031, "WEB");
        Swagger.Status();
    }
}
