public class NumberPrimeOrNot {

    public static void primeNumber(int number)
    {

        boolean check = true;
        for(int i =2; i <number/2; i++)
        {

          if (number % i == 0)
                check = false;
                break;
        }
        if (number == 0 || number == 0 || check == false)
        {
            System.out.print("The Number is Not Prime ");
        }
        else
        {
            System.out.print("The Number is Prime ");
        }
    }


    public static void main(String[] args)
    {
         int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        primeNumber(number);

    }
}
