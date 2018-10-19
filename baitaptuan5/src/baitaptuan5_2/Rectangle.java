package baitaptuan5_2;

public class Rectangle extends Shape{
    double width = 1.0; 
    double length = 1.0; 
    Rectangle(){}; 
    Rectangle(double width, double length){
        this.width = width; 
        this.length = length; 
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.color = color; 
        this.filled = filled; 
        this.width = width; 
        this.length = length; 
    }
    double getWidth(){
        return this.width; 
    }
    void setWidth(double width){
        this.width = width; 
    }
    double getLength(){
        return this.length; 
    }
    void setLength(double length){
        this.length = length; 
    }
    double getArea(){
        return this.length*this.width; 
    }
    double getPerimeter(){
        return (this.length + this.width)*2; 
    }
    @Override
    public String toString(){
        return "Rectangle"; 
    }
}
