package baitap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Running t=new Running();
        t.start();
    }
    
}
class Running extends Thread{
        Scanner in=new Scanner(System.in);
        public void run(){
            System.out.print("go vao dong chu:");
            String line=in.nextLine();
            while(true){
                line=line.charAt(line.length()-1)+line.substring(0,line.length()-1);
                System.out.println(line);
                try{
                    sleep(400);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
