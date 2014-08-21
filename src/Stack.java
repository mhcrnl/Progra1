/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco_197
 */
public class Stack {
    private int size;
    private final int maxsize = 100;
    private int [] arreglo;
    
    public Stack(){
        size =0;
        arreglo = new int [maxsize];
        
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void push (int e){
        if (this.size < this.maxsize){
            this.arreglo [size ++] = e;
            
        }
        else{
            //throw new Exceptionilegal
        }
    }
    
//    public int void pop (){
//        if (size>0){
//          return arreglo[size-1];
//        }
//        else{
//            //throw
//        }
//            
//    }
    
    public void empty() {
        size=0;
}
    
}
