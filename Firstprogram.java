import java.util.Scanner;

public class Firstprogram { 
   public static void main(String[] args) 
   {
      System.out.println("Messi");
      
      Scanner myscan = new Scanner(System.in);

      int[] arr = new int[5];

      for(int i = 0; i < arr.length; i++)
      {
         int abc =  myscan.nextInt();

         arr[i] = abc;
      }

      for (int i = 0; i < arr.length; i++) 
      {  
         System.out.println(arr[i]);
         
      }

   }
}
