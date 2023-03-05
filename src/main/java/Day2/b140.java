package Day2;

import java.util.Random;
import java.util.Scanner;

public class b140 {
    private double minPositiveNumber(double arr[],int n)
    {
        double min = -1;
        int tempCount = 0;
        for(int i = 0 ; i < n; i++){
            if(arr[i] > 0){
                if(tempCount == 0){
                    min = arr[i];
                    tempCount ++;
                }else if(min > arr[i]){
                    min = arr[i];
                }
            }

        }
        return min;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        b140 minNumber = new b140();

        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            double[] arr = new double[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextDouble(200)-100;
                System.out.printf("%.1f ",arr[i]);
            }

            double number = minNumber.minPositiveNumber(arr, n);
            System.out.printf("\nGia tri duong nho nhat la: %.1f",number);

        }
    }
}
