import java.util.Scanner; 

 public class MyClass
 {
  public static void main(String[] args)
  {
    int x, y, modulus;
    Scanner sc = new Scanner(System.in); 
    x = sc.nextInt();
    y = sc.nextInt(); 
    modulus = x % y; 
    System.out.println(modulus); 
  }
}