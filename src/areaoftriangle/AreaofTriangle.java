/*
 * Lewis White
 * February 19, 2019
 * This program will calculate the area of a scalene triangle.
 */

package areaoftriangle;

import static java.lang.Math.sin;
import javax.swing.JOptionPane;

/**
 *
 * @author lewhi7273
 */
public class AreaofTriangle {

    /**
     * This method will attempt to find the area of a triangle
     */
    public static void main(String[] args) {
        //ask the user for mesurements
        String sidea = JOptionPane.showInputDialog("What is the length of side a in inches? ");
        String sideb = JOptionPane.showInputDialog("What is the length of side b in inches? ");
        String anglec = JOptionPane.showInputDialog("What is the angle of c in radians? ");
        
        //declare final variables
        double a,b,c;
        
         a = Double.parseDouble(sidea);
         b = Double.parseDouble(sideb);
         c = Double.parseDouble(anglec);
        
         //calculate the area
         double area = (a*b*sin(c))/2;
         
         //display the results
         JOptionPane.showMessageDialog(null, "The area of the triangle is: " + area + " inches squared");
    }
    
}
