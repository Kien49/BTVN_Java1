package Day2;

import java.util.Random;
import java.util.Scanner;

public class b135 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();


        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            boolean isPositiveNumber = false;

            double[] arr = new double[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextDouble(200) - 100;
                System.out.printf("%f ",arr[i]);
            }

            for (int i =0; i< arr.length; i++){
                if(arr[i] > 0){
                    System.out.printf("\nSo duong dau tien: %.1f", arr[i]);
                    isPositiveNumber =true;
                    break;
                }
            }
            if(!isPositiveNumber){
                System.out.print("\n-1");
            }
        }
    }
}
