/*
MathClass.java 
Created by: Lucas N-H
Created on: March 7, 2018
Last edited on: March 7, 2018
*/
package mathclass;

import java.text.*;
public class MathClass {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number = 912.3456;
        DecimalFormat x = new DecimalFormat ("###.##");
        System.out.println(x.format(number));
        
        int myNumberRounded;
        double myNumber=718.941;
        myNumberRounded = (int) Math.round(myNumber);
        System.out.println(myNumberRounded);
        
        System.out.println(Math.random());
    }
}
