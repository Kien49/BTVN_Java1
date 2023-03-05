package Day2;

import java.util.Random;
import java.util.Scanner;

public class b137 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            double[] arr = new double[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextDouble(200)-100;
                System.out.printf("%.1f ",arr[i]);
            }

            double min = arr[0];
            int Pos = 0;
            for (int i =0; i< n; i++){
                if(min > arr[i]){
                    min = arr[i];
                    Pos = i;
                }
            }
            System.out.printf("\nmin: %.1f \nPos: %d", min, Pos);

        }
    }
}
