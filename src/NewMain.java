/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco_197
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Library n = new Library();
       n.InsertEnd("localoca", "shakira", "latin", "sale el sol", 13, "", "");
       n.InsertEnd("as", "as", "as", "as", 2, "", "");
       n.InsertEnd("qw", "", "", "", 3, "", "");
       //n.delete("localoca");
       n.delete("as");
       n.delete("qw");
       n.printconsole();
       //n.printconsole();
               
        
    }
    
}