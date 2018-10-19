package baitaptuan4;

import java.util.ArrayList;

public class Baitaptuan4 {
    static int MaxNumber(int a, int b){
        if (a > b) return a; 
        else return b; 
    }
    static int MinInArray(ArrayList<Integer> Arr){
        int k = Arr.size(), min = Arr.get(0); 
        for(int i = 1; i < k; i++){
            if (Arr.get(i) < min){
                min = Arr.get(i); 
            }
        }
        return min; 
    }
    static String assessmentBMI(float weight, float height){
        float BMI = weight/(height*height); 
        if (BMI < 18.5){
            return "Thieu can"; 
        }
        else if (BMI >= 18.5 && BMI < 24.99){
            return "Binh thuong"; 
        }
        else if (BMI >= 24.99 && BMI <= 25){
            return "Thua can"; 
        }
        else if (BMI > 25){
            return "Beo phi"; 
        }
        return ""; 
    }
    public static void main(String[] args) {
       assessmentBMI((float)56, (float)1.5); 
    }  
}