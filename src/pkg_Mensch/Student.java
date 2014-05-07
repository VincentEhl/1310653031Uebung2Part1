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
public class Student extends Mensch{

    public Student(String v, String n, short a, int m, String s) {
        super(v, n, a);
        m = matrikelnummer;
        s = studiengang;
    }
    
    private int matrikelnummer;
    private String studiengang;
    
    
    @Override
    public void Status(){
        System.out.println("Hierbei handelt es sich um einen Studenten. Sein Name lautet " + vorname + " " + nachname + " und er ist " + alter + " Jahre alt.");
    }
}
