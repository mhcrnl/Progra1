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
       //Library n = new Library();
       GetPath x = new GetPath();
       x.GetPath();
//       System.out.println("Holis");
//       n.InsertEnd("localoca", "shakira", "latin", "sale el sol", 13, "", "");
//       n.InsertEnd("as", "as", "as", "as", 2, "", "");
//       n.InsertEnd("qw", "", "", "", 3, "", "");
//       n.delete("localoca");
//       n.printconsole();
       try
        {
            MP3source Player=new MP3source();
            Player.AbrirFichero("/Users/marco_197/Downloads/05 - The Number Of The Beast.mp3");
            
            Player.Play();
            
        }
 
 
 
        catch(Exception Error)
        {
            Error.printStackTrace();
        }

               
        
    }
    
}