/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wait_notify;

/**
 *
 * @author ADMIN
 */
public class ThreadA implements Runnable{
    MyObject object;
    int i = 0;
 
    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }
 
    public void run() {     
        for(int i = 1; i <= 100; i++){
            if(i%10 == 0){
                object.setValue(i);
                try{
                    Thread.sleep(400);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
        System.out.println("Thread A - Finished");
    }
 
}