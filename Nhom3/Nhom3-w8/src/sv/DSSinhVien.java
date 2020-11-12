package sv;



import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class DSSinhVien {
    private List<SinhVien> list;
    private String file;
    public DSSinhVien(){
        list=new ArrayList<>();
        file="src/sv/sinhvien.txt";
        try{
          BufferedReader br=new BufferedReader(new FileReader(file));
          String line="";
          while((line=br.readLine())!=null){
              String[] s=line.split(";");
              SinhVien sv=new SinhVien(s[0],
                      s[1],Integer.parseInt(s[2]));
              list.add(sv);
              
          }
          br.close();
                  }catch(FileNotFoundException e){
                      System.out.println(e);
                  }catch(IOException e){
                      System.out.println(e);
                  }
    }
    public void viet(){
        for(SinhVien i:list)
            System.out.println(i.toString());
    }
    public void vietFile(){
        PrintWriter p;
        try{
            p=new PrintWriter(file);
            for(SinhVien i:list){
                String line=i.getMa()+";"+i.getTen()+";"+i.getTuoi();
                p.write(line+"\n");
            }
            SinhVien i=new SinhVien("HH6543","Ngu dan", 20);
            p.write(i.getMa()+";"+i.getTen()+";"+i.getTuoi());
            p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
