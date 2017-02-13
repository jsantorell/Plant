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
public class Reporter {

    Reporter(int months, String a, String cuizineItIsUsedIn, NewPlant p) {//Leafy Green Report
        System.out.println("Grow time is: " + months + " months");
        System.out.print("Growing Season: ");
        p.GetTheSeasonAndOutput(a);
        System.out.print("#1 Cuizine it is used in: ");
        System.out.println(cuizineItIsUsedIn);
    }

    public Reporter(double price) {//Cabbage Report

        System.out.print("Price: ");
        System.out.println(price);
    }

}
