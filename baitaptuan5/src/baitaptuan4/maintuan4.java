package baitaptuan4;

import java.util.*;


public class maintuan4 {
    public static void main(String[] args){
        Random rd = new Random(); 
        Scanner input = new Scanner(System.in); 
        int num = rd.nextInt(99) + 1; 
        int numguess = input.nextInt(); 
        if (numguess > num){
            System.out.println("Lớn hơn");
        }
        else if (numguess < num){
            System.out.println("Nhỏ hơn");
        }
        else{
            System.out.println("Bằng nhau");
        }
    }
}
