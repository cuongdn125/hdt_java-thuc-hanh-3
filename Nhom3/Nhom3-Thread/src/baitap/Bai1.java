package baitap;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Bai1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
            @Override
            public void run() {
                       while(true){
            System.out.println(f.format(new Date()));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        } 
            }
        }).start();
    }
}
//class Clock extends Thread{
//    public void run(){
//        SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
//        while(true){
//            System.out.println(f.format(new Date()));
//            try{
//                sleep(1000);
//            }catch(InterruptedException e){
//                System.out.println(e);
//            }
//        }
//    }
//}