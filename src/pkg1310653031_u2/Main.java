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
public class Main {

   
    public static void main(String[] args) {
        
        Mensch Sepp = new Mensch ("Josef", (short)32, "männlich");
        String nag = Sepp.printAll();
        System.out.println(nag);
    }
    
}
