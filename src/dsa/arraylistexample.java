/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;
import java.util.*;
/**
 *
 * @author Malindu
 */
public class arraylistexample {
public void arraylistcreate(){
ArrayList<String> a=new ArrayList<String>();

a.add("malindu");
a.add("amith");
a.add("ayesh");
a.add("isuru");
a.add("lanka");

System.out.println(a);

a.add(4,"bhathiya");
System.out.println(a);
a.remove("malindu");
System.out.println(a);
a.remove(3);
System.out.print(a);
}  
}
