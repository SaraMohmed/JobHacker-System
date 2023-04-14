
package week2;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class EvenOrOdd {

    public static void printNum(int number){
        if(number%2==0){
            System.out.println("The Number is Even");
        }
        else if(number%2!=0){
           System.out.println("The Number is Odd"); 
        }
    }
     
     
    
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        printNum(n);
       
    }
    
    
}
