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
public class Mensch {
    String vorname;
    String nachname;
    short alter;
    
    
    
    public Mensch(String v, String n, short a){
    vorname = v;
    nachname = n;
    alter = a;
}
    
    public void Status(){
        System.out.println("Hierbei handelt es sich um einen Menschen. Sein Name lautet " + vorname + " " + nachname + " und er ist " + alter + " Jahre alt.");
    }
            
}
