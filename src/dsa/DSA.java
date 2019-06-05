/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author Malindu
 */
public class DSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     arraylistexample obj1=new arraylistexample();
//     obj1.arraylistcreate();
        
       stackimpl obj1=new stackimpl(10);
       obj1.push(4);
       obj1.push(8);
       obj1.push(22);
       obj1.push(52);
       obj1.peek();
       obj1.pop();
       obj1.pop();
        while (!obj1.isEmpty()) {
         long value = obj1.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
     
    }
    
}
