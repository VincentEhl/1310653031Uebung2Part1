/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653031_u2;

/**
 *
 * @author Vincent McCawk
 */
public abstract class Säugetier {
    
    String name;
    short alter;
    String geschlecht;
    
    
    public Säugetier(String n, short a, String g){
        name = n;
        alter = a;
        geschlecht = g;
    }
    
    public abstract String printAll();
}
