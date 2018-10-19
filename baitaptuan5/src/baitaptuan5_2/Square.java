package baitaptuan5_2;


public class Square extends Rectangle{
    double side = 1; 
    Square(){}; 
    Square(double side){
        this.side = side; 
    }
    Square(double side, String color, boolean filled){
        this.side = side; 
        this.color = color; 
        this.filled = filled; 
    }
    double getSide(){
        return this.side; 
    }
    void setSide(double side){
        this.side = side; 
    }
    @Override
    void setWidth(double side){
        this.width = side; 
    }
    @Override
    void setLength(double side){
        this.length = side; 
    }
    @Override
    public String toString(){
        return "Square"; 
    }
}
