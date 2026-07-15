/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isma11062026;

/**
 *
 * @author LAB-SI-PC
 */
abstract class Kendaraan1 {
    public abstract double getMaxSpeed();
    public abstract String getName();
}

class Mobil extends Kendaraan1 {
    private double s;
    private double t;

    public Mobil(double s, double t) {
        this.s = s;
        this.t = t;
    }

    @Override
    public double getMaxSpeed() {
        return s/t;
    }

    @Override
    public String getName() {
        return "Mobil";
    }
}

class Motor extends Kendaraan1 {
    private double s;
    private double t;

    public Motor(double s, double t) {
        this.s = s;
        this.t = t;
    }

    @Override
    public double getMaxSpeed() {
        return s/t;
    }

    @Override
    public String getName() {
        return "Motor";
    }
}

public class Kendaraan {
    public static void main(String[] args){
        Mobil mobil = new Mobil(16, 4);
        Motor motor = new Motor(7, 2);
        
        System.out.println("Nama        :"+mobil.getName());
        System.out.println("Kecepatan   :"+mobil.getMaxSpeed()+"km/jam");
        
        System.out.println();
        System.out.println("Nama        :"+motor.getName());
        System.out.println("Kecepatan   :"+motor.getMaxSpeed()+"km/jam");
}
}