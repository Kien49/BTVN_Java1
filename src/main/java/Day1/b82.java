package Day1;
import java.util.Scanner;
public class b82 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Nhap a,b,c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        in.close();

        double  max = a;
        if( b > max) {
            max = b;
        }if(c > max) {
            max = c;
        }
        System.out.printf("Max: %.1f",max);
    }
}
