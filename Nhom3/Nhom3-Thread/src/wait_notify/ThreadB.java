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
public class ThreadB implements Runnable{
    MyObject obj;
 
    public ThreadB(MyObject obj) {
        this.obj = obj;
    }
 
    public void run() {     
        while(true){            
            obj.showValue();
            if(obj.i == 100)
                break;
        }
        System.out.println("Thread B - Finished");
    }
 
}