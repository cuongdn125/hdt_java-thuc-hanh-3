package mt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ADMIN
 */
public class Main1 {
    public static void main(String[] args) {
        Matran m=new Matran();
        int[][] a=m.read();
        int[][] b=m.read();
        int[][] c=m.tong(a, b);
        m.viet(a);
        m.viet(b);
        m.viet(c);
        int[][] d=m.hieu(a, b);
        m.viet(d);
    }
}
