/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco_197
 */
/**

 * @author marco_197
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Library n = new Library();
       n.InsertEnd("f", "", "", "", 0, "", "");
       n.InsertEnd("w", "", "", "", 0, "", "");
       n.InsertEnd("r", "", "", "", 0, "", "");
       n.Delete("f");
       //n.printconsole();
       String ruta;
       GetPath x = new GetPath();
       //ruta = x.GetPath();
  
       Main test =new Main(n);
       test.setVisible(true);
      
    
}
}