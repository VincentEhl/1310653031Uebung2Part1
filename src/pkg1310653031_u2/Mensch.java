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
public class Mensch extends Säugetier {

    public Mensch(String n, short a, String g) {
        super(n, a, g);
    }

    @Override
    public String printAll() {
        String nag = (name + "#" + alter + "#" + geschlecht);
        return nag;
    }
    
    
}
