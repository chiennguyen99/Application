package baitaptuan5_2;

public class Shape {
    String color = "red"; 
    boolean filled  = true; 
    Shape(){}; 
    Shape(String color, boolean filled){
        this.color = color; 
        this.filled = filled; 
    }
    String getcolor(){
        return color; 
    }
    boolean isFilled(){
        return filled; 
    }
    void setColor(String color){
        this.color = color; 
    }
    void setFilled(boolean filled){
        this.filled = filled; 
    }
    String ToString(){
        return "Shape"; 
    }
}
