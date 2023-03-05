package Day2;

import java.util.Random;
import java.util.Scanner;

public class b134 {
    private double Max(double[] arr){
        double max = arr[0];
        for (int i =0; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        b134 timMax = new b134();

        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            double[] arr = new double[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextDouble(500);
                System.out.printf("%f ",arr[i]);
            }

            double max = timMax.Max(arr);

            System.out.printf("\nmax: %.1f",max);

        }
    }
}
