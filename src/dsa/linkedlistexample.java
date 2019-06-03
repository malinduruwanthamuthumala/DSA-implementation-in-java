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
import java.util.*;
public class linkedlistexample {
public void linklist(){
   LinkedList<String> linkedlist = new LinkedList<String>();
   
   linkedlist.add("malindu");
   linkedlist.add("lanka");
   linkedlist.add("ayesh");
   linkedlist.add("isuru");
   linkedlist.add("ishara");

   System.out.println("content of the linkedlist"+linkedlist);
   
   linkedlist.addFirst("first item");
   linkedlist.addLast("last item");
   
   System.out.println(linkedlist);
   
   String str=linkedlist.get(4);
   System.out.println(str);
}

        
        
}
