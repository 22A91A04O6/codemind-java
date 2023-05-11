import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,area;
        b=sc.nextDouble();
        c=sc.nextDouble();
        a=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}