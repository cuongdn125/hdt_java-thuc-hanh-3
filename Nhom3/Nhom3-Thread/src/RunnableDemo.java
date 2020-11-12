/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class RunnableDemo implements Runnable{
    private int num;
    public RunnableDemo(int num){
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println("Bat dau runnable");
        for (int i = 0; i < num; i++) {
            System.out.println("Runnable :"+i);
            try{
               Thread.sleep(1000);//1000-1s 
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Runnable ket thuc");
    }
    
}
