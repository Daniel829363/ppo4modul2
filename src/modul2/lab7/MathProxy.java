/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab7;

/**
 *
 * @author Acer
 */
public class MathProxy implements IMath{

    private Math math;

    public MathProxy() {
        math = new Math();
    }

    public double add(double x, double y) {
        return math.add(x, y);
    }

    public double sub(double x, double y) {
        return math.sub(x, y);
    }

    public double mul(double x, double y) {
        return math.mul(x, y);
    }

    public double div(double x, double y) {
        return math.div(x, y);
    }
} 

