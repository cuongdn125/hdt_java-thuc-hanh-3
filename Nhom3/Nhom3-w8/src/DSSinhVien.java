
import java.util.ArrayList;
import java.util.List;

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
    public DSSinhVien(){
        list=new ArrayList<>();
        try{
          BufferedReader br=new BufferedReader(new FileReader("src/sinhvien.txt"));
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
}
