
package week2;


/**
 *
 * @author sara
 */
public class PrintNumbers {

    public static void printNum(){
         for(int i=1;i<=100;i++){
             if(i%3==0){
                 System.out.println(i);
             }
         }
    }
    
    public static void main(String[] args) {
         printNum();
    }
    
}

