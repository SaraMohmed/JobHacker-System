
package week2;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class EvenOrOdd {

    public static void printEvenOrOdd(int number){
        if(number%2 == 0)
        {
            System.out.println("The Number is Even");
        }
        else 
        {
           System.out.println("The Number is Odd"); 
        }
    }
     
     
    
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        printEvenOrOdd(number);
       
    }
    
    
}

