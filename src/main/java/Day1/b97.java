package Day1;
import java.util.Scanner;
public class b97 {
    public static void main(String[] args) {
        float a,b,c;
        System.out.print("Nhap 3 canh cua tam giac: ");
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        in.close();

        if( a < 0 || b< 0 || c< 0
                || (a+b < c) || (a+c < b)|| (b+c < a) ) {
            System.out.print("Day khong phai la tam giac");
        }else {
            if((a == b) && (b == c)) {
                System.out.print("Tam Giac Deu.");
            }else if((a*a + b*b == c*c && a == b)|| (a*a + c*c == b*b && a==c )|| (b*b + c*c == a*a&& b==c )) {
                System.out.print("Tam Giac Vuong Can.");
            }else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.print("Tam Giac Vuong.");
            }else if(a == b || a == c || b == c) {
                System.out.print("Tam Giac Can.");
            }else {
                System.out.print("Tam Giac Thuong.");
            }
        }
    }
}