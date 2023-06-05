import java.util.Scanner;
public class MultiplyFloatingNumbers {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      float flt1 = sc.nextFloat();

      float flt2 = sc.nextFloat();

      float product = flt1*flt2;
      System.out.printf("%.2f",product);
   }
}