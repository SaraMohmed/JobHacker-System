
package distancebetweentwopoints;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


/**
 *
 * @author sara
 */
public class DistanceBetweenTwoPoints {

    
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        Scanner input=new Scanner(System.in);
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        
        double subx=pow(x2-x1,2);
        double suby=pow(y2-y1,2);
        
        double distance=sqrt(subx+suby);
        System.out.printf("%.4f",distance);
    }
    
}
