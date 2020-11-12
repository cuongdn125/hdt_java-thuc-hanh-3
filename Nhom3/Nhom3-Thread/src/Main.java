/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+" bat dau");
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName()+" :"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        ThreadDemo t1=new ThreadDemo("Mua thu", 5);
        //t1.start();
        
        RunnableDemo r=new RunnableDemo(5);
        Thread t2=new Thread(r, "cuoi ha");
        //t2.start();
        DiamonDemo t3=new DiamonDemo();
        t3.setDaemon(true);
        //t3.start();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
        
        System.out.println(t.getName()+" ket thuc");
    }
}
