
package areaofacircle;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class AreaOfACircle {

    
    public static void main(String[] args) {
      
        double n=3.14159;
        double r;
        Scanner input=new Scanner(System.in);
        r=input.nextDouble(); 
        double area=n*r*r;
        System.out.println("A="+area);
        
    }
    
}
