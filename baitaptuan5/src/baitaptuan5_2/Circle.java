package baitaptuan5_2;

public class  Circle extends Shape{
    double radius = 1.0; 
    final double PI  = 3.14; 
    Circle(){}; 
    Circle(double radius){
        this.radius = radius; 
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius; 
        this.color = color; 
        this.filled = filled; 
       
    }
    double getRadius(){
        return radius; 
    }
    void setRadius(double radius){
        this.radius = radius; 
    }
    double getArea(){
        return radius*radius*PI; 
    }
    double getPerimeter(){
        return 2*radius*PI; 
    }
    @Override
    public String toString(){
        return "Circle"; 
    }
}
