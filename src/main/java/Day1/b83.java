package Day1;
import java.util.Scanner;
public class b83 {
    public static void main(String[] args) {
        double a, b;
        System.out.print("Nhap a,b: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        in.close();

        if(a >= 0 && b >= 0 || (a < 0 && b < 0)) {
            System.out.printf("%.1f va %.1f cung dau", a, b);
        }else {
            System.out.printf("%.1f va %.1f trai dau", a, b);
        }
    }
}