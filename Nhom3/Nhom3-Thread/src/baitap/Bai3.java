package baitap;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("n: ");
        int n=Integer.parseInt(in.nextLine());
        T1 t1=new T1(n);
        T2 t2=new T2(n);
        t1.start();
        t2.start();
    }
}
class T1 extends Thread{
    private int num;
    public T1(int num){
        this.num=num;
    }
    public void run(){
        int n=num;
        while(n>=0){
            System.out.println("\033[31m count:"+n--);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class T2 extends Thread{
    private int num;
    private boolean Ngto(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    private boolean ok(int n){
        String s=new String(n+"");
        if(s.endsWith("3")&&Ngto(n))
            return true;
        else
            return false;
    }
    public T2(int num){
        this.num=num;
    }
    public void run(){
        int n=num;
        int p=3;
        while(n>=0){
            while(true){
              if(ok(p)){  
                System.out.println("Nguyen to:"+p);
                p++;
                break;
              }
              p++;
            }
            n--;
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
    