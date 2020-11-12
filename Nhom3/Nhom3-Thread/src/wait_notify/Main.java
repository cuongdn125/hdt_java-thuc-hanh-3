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
public class Main {
    public static void main(String[] args) {
        MyObject object = new MyObject();
 
        Thread tA = new Thread(new ThreadA(object));
        Thread tB = new Thread(new ThreadB(object));
 
        tA.start();
        tB.start();
    }
}
