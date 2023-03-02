package Day1;
import java.util.Scanner;
public class b98 {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;
        System.out.print("Nhap a,b,c,d,e,f: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        e = in.nextDouble();
        f = in.nextDouble();
        in.close();

        double D = a * e - d * b;
        double Dx = c * e - f * b;
        double Dy = a * f - d * c;
        if(D == 0) {
            if (Dx + Dy == 0) {
                System.out.print("He phuong trinh vo so nghiem");
            }
            else {
                System.out.print("He phuong trinh vo nghiem");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("He phuong trinh co nghiem (x, y) = (%.1f, %.1f)", x, y);
        }
    }
}