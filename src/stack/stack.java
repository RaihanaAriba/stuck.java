/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author hanaaaaa
 */
public class stack {
    static Stack Raihanaa = new Stack();
    static Scanner in = new Scanner(System.in);
    static String a;
    static String arr;
    static int max_st;
    static int i=0;
    static int top =-1;
    static void pushh(Stack Raihanaa, String a){
        Raihanaa.push((a).toString());
        System.out.println("Stack: " + Raihanaa);
    }
public int find(){
    return (int) (top=top+1);
    }
static void popp(Stack Raihanaa, String a ){
    a = (String) Raihanaa.pop();
    System.out.println("stack: " + Raihanaa);
    }
public static void main(String[] args) {
    System.out.print("Masukkan Max_Stack : "); 
    max_st=in.nextInt();
        for (int i = 0; i < max_st; i++) {
            System.out.print("PUSH -> ");
            a=in.next();
            pushh(Raihanaa, a);   
        }
    System.out.println("POP = y / anykeys=stop");
      while(!a.equals("n")){
        System.out.print("POP ->  ");
            a=in.next();
            if (a.equals("y") && !Raihanaa.isEmpty()) {
                popp(Raihanaa, a);
            }else{
                System.out.println("apa stack kosong?  "+Raihanaa.isEmpty());
                break;
            }
        System.out.println("apa stack kosong?  "+Raihanaa.isEmpty());
            if (Raihanaa.isEmpty()) {
                System.out.println("stop");
                    break;
            }
      }
}
}