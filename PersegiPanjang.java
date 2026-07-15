/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin11062026;

/**
 *
 * @author LAB-SI-PC
 */
public class PersegiPanjang implements Relations {
    private double panjang;
    private double lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public boolean isGreater(Object a, Object b) {
        double aLuas = ((PersegiPanjang)a).getLuas();
        double bLuas = ((PersegiPanjang)b).getLuas();
        return (aLuas > bLuas);
    }

    @Override
    public boolean isLess(Object a, Object b) {
        double aLuas = ((PersegiPanjang)a).getLuas();
        double bLuas = ((PersegiPanjang)b).getLuas();
        return (aLuas < bLuas);
    }

    @Override
    public boolean isEqual(Object a, Object b) {
        double aLuas = ((PersegiPanjang)a).getLuas();
        double bLuas = ((PersegiPanjang)b).getLuas();
        return (aLuas == bLuas);
    }
}
