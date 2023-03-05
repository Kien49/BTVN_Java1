package Day2;

import java.util.Random;
import java.util.Scanner;

public class b139 {
    private boolean perfectNumber(int n)
    {
        int sum = 0;
        for (int i = 1 ; i < n; i++){
            if( n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }
        return false;
    }
    private int posPerfecrNumber(int arr[],int n)
    {
        for(int i = n-1 ; i >= 0; i--){
            if(perfectNumber(arr[i])){
                System.out.printf("\nSo hoan thien la: %d",arr[i]);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        b139 perfect = new b139();

        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            int[] arr = new int[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextInt(200)-100;
                System.out.printf("%d ",arr[i]);
            }

            int pos = perfect.posPerfecrNumber(arr, n);
            System.out.printf("\nVi tri so hoan thien cuoi cung la: %d",pos);

        }
    }
}
