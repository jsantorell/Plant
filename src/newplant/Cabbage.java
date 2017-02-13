/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newplant;

/**
 *
 * @author jerem
 */
public class Cabbage extends LeafyGreen {

    private double price;

    public Cabbage(double price, int months, String a) {//cabbage
        super(months, a);
        this.price = price;
        Reporter r = new Reporter(price);
    }

    public double getShape() {
        return price;
    }

    public void setShape(double shape) {
        this.price = shape;
    }

}
