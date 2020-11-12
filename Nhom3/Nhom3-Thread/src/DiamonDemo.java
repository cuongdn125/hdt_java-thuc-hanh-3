/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class DiamonDemo extends Thread{
    public void run(){
        while(true){
            System.out.println("chay ngam");
            System.out.println("ket thuc thi don dep");
            try{
                sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
