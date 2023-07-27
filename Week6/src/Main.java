import java.util.*;

public class Main
{


   public static void task1()
   {
       Scanner  input = new Scanner(System.in);
       HashSet <Integer> set = new HashSet();
        int queries = input.nextInt();

        for(int j = 0; j < queries; j++)
        {
            char types = input.next().charAt(0);
            int number;

            if(types == 'a')
            {
                number = input.nextInt();
                set.add(number);
            }

            else if(types == 'b')
            {
                ArrayList<String> list = new ArrayList(set);
                Collections.sort(list);
                System.out.println(list);
            }
            else if(types == 'c')
            {
                number = input.nextInt();
                set.remove(number);

            }
            else if(types == 'd')
            {
                number = input.nextInt();
                if(set.contains(number))
                    System.out.println(1);
                else
                    System.out.println(-1);

            }
            else if(types == 'e')
            {
                System.out.println(set.size());
            }
        }

   }




    public static void task2(){
        HashMap <Character,String> hashmap = new HashMap <>();
        hashmap.put('c',"sara");
        hashmap.put('d',"habiba");
        hashmap.put('b',"reham");
        hashmap.put('a',"hagar");

        TreeMap<Character,String> treemap=new  TreeMap<Character,String> (hashmap);
        Iterator iterator = hashmap.keySet().iterator();

        while(iterator.hasNext())
        {
            char key=(char)iterator.next();

            System.out.println("Key: "+key+"  Value: "+hashmap.get(key));
        }
    }




    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        for(int i = 0; i < testCases; i++)
        {
            task1();
        }

        task2();

    }
}