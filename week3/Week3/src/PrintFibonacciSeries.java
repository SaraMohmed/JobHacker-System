public class PrintFibonacciSeries {

    public static int fibonacci (int number)
    {
         if(number <= 1)
         {
            return number;
         }
         else
         {
             return  fibonacci (number - 1) + fibonacci (number - 2);
         }

    }

     public static void main(String[] args)
     {
         int number;
         Scanner input = new Scanner(System.in);
         number = input.nextInt();
         fibonacci (number);
     }
}
