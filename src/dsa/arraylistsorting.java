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
public class arraylistsorting {
public void arraylistsorting(){
ArrayList<String> b=new ArrayList<String>();
b.add("apple");
b.add("carrot");
b.add("mango");
b.add("banana");
b.add("lemon");

for(String str:b){
System.out.println(str);
}
Collections.sort(b);
for(String str1:b){
System.out.println(str1);
}
}  

}
