import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
     
     
        Scanner sc = new Scanner(System.in);
        float a,b;
        a = sc.nextFloat();
        b = sc.nextFloat();
        float c;
        
        c=(a + b) / 2;
        System.out.printf("%.4f",c);
    }
}