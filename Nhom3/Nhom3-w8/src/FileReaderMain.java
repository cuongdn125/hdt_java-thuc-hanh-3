/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) {
        String file="src/Nhom.txt";
        FileReader f;
        try{
            f=new FileReader(file);
            int k;
            char c;
            while(true){
                k=f.read();
                if(k==-1)
                    break;
                c=(char)k;
                System.out.print(c);
            }
            f.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
