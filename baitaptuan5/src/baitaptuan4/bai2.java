package baitaptuan4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai2 {
    static String NAMEFILE = "filetest.txt"; 
    static void mofile(){
        try{
            File file = new File(NAMEFILE);
            file.createNewFile();
        }catch(IOException ex){
            System.out.println("Khong mo file duoc");
        }
    }
    static int readfile(){
        BufferedReader Br = null; 
        FileInputStream FI = null;
        int d = 0; 
        try{
            FI = new FileInputStream(NAMEFILE);
            Br = new BufferedReader(new InputStreamReader(FI, "UTF-8")); 
            String s = Br.readLine();
            while (s != null){
                d++; 
                s = Br.readLine(); 
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }try{
            if (Br != null){
                Br.close();
            }
            if (FI != null){
                FI.close();
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
        }
        return d; 
    }
    public static void main(String[] args){
//        mofile(); 
        System.out.println(readfile());
    }
}
