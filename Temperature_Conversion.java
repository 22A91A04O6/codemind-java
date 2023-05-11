import java.util.Scanner;
 
public class CelsiusToFahrenheit {
    public static void main(String args[]) {
        double celsius, fahren;
        Scanner scanner;
        scanner = new Scanner(System.in);
        celsius = scanner.nextFloat();
 
        fahren = (9.0 / 5.0) * celsius + 32;
 
        System.out.printf("%.2f",fahren);
    }
}