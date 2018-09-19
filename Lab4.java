/* Test Plans
 * 3 2 1 4 5
 * 6 9 8 7 null
 * 1 3 4 2 3 3
 * 1 5 2 3 apple
 * 5 5 5 5 5
 */ 

public class Lab4
{
  
  public static Integer [] sortArray (Integer [] num)
  {
    for (int i = 4; i > 0; i--)
    {
      if (num[i] > num[i - 1])
      {
        int temp = num[i];
        num[i] = num[i-1];
        temp = num[i-1];
      }
    }
    return num;
  }
  
  public static void main (String[] args)
  {
    int [] num = new int []{3, 2, 1, 4, 5};
    System.out.println(num);
  }
}