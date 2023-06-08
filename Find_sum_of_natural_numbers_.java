import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

        int num, count, total = 0;

        
        

        Scanner scan = new Scanner(System.in);
        
        num = scan.nextInt();
        
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println(+total);
    }
}