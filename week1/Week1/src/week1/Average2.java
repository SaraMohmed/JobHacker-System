
package week1;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Average2 {

  
    public static void main(String[] args) {
      double grade1, grade2, grade3;
      Scanner  input = new Scanner(System.in);
      grade1 = input.nextDouble();
      grade2 = input.nextDouble();
      grade3 = input.nextDouble();
      
      grade1*= 2/10.0;
      grade2*= 3/10.0;
      grade3*= 5/10.0;
      
      double average = grade1+ grade2+ grade3;
        System.out.println("MEDIA = "+average);
      
    }
    
}

