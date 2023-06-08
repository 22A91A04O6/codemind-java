import java.util.Scanner;


public class FibonacciProgramUsingLoop {

 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

       

        int maxNumber = scanner.nextInt();
        
        int previousNumber = 0;
        int nextNumber = 1;

      

        for (int i = 1; i <= maxNumber; ++i) {
             System.out.print(previousNumber + " ");
             int sum = previousNumber + nextNumber;
             previousNumber = nextNumber;
             nextNumber = sum;
        }
  
        scanner.close();
    }
}