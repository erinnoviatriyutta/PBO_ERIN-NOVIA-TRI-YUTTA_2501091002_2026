/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isma11062026;

/**
 *
 * @author LAB-SI-PC
 */
//abstract Class
abstract class Shape {
    public abstract double getArea();
    public abstract String getName();

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
//subclass Square
class square extends Shape{
    private double side;
    
    public square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public String getName() {
        return "square";
    }
}



//main class
public class AbstrakClass3 {
    public static void main(String [] args){
        Circle circle =new Circle(8);
        square square =new square(6);
        
        System.out.println("Nama    :"+circle.getName());
        System.out.println("Luas    :"+circle.getArea());
        
        System.out.println("Nama    :"+square.getName());
        System.out.println("Luas    :"+square.getArea());
        
        
    }
}