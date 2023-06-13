import java.util.Scanner;
public class MinMaxElements {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr[] = new int [1000];
        int i;
        for( i = 0; i < 1000; i++)
        {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int j = 0; j < 1000; j++)
        {

            if(arr[j] < min)
            {
                min = arr[j];
            }
        }
        System.out.println( min);

        for(int j = 0; j < 1000; j++)
        {

            if(arr[j] > max)
            {
                max = arr[j];
            }
        }
        System.out.println( max);

    }
}
