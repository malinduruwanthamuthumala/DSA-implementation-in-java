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
public class stackimpl {
    private int maxsize;
    public long[] stackarrray;
    private int top;
    
    public stackimpl(int s){
    maxsize=s;
    stackarrray=new long[maxsize];
    top=-1;
    }
    
    public void push(long j){
    stackarrray[++top]=j;
    }
    public long pop(){
    return stackarrray[top--];
    }
    public long peek(){
    return stackarrray[top];
    }
     public boolean isEmpty() {
      return (top == -1);
   }

}
