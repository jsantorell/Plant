package newplant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jerem
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NewPlant brusselSprouts = new Cabbage(
                /*Select the shape of the cabbage*/
                1.23,
                /*Select Months this plant takes to grow*/
                4,
                /*Season the month to start to harvest 
                
                >>>>>>EXAMPLE: March-November<<<<<<
                
                This can be left blank*/
                "February-December");

        System.out.println("");

        NewPlant magicSprouts = new Cabbage(
                /*Select the shape of the cabbage*/
                3.25,
                /*Select Months this plant takes to grow*/
                1,
                /*Season the month to start to harvest 
                
                >>>>>>EXAMPLE: March-November<<<<<<
                
                This can be left blank*/
                "December");

    }

}
