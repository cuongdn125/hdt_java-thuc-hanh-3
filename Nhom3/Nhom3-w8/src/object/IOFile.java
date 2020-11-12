/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class IOFile {
    //ghi vao file
    public static <T> void viet(String file, List<T> list){
        ObjectOutputStream o;
        try{
            o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(list);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    //doc tu file
    public static <T> List<T> doc(String file){
        List<T> arr=new ArrayList<>();
        ObjectInputStream o;
        try{
            o=new ObjectInputStream(new FileInputStream(file));
            arr=(List<T>)o.readObject();
            o.close();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        return arr;
    }
}
