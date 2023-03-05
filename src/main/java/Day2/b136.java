package Day2;

import java.util.Random;
import java.util.Scanner;

public class b136 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            int[] arr = new int[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextInt(200)-100;
                System.out.printf("%d ",arr[i]);
            }

            boolean isEvenNumber = false;

            for (int i =n-1; i >= 0; i--){
                if(arr[i] % 2 == 0){
                    System.out.printf("\nSo chan cuoi cung cua day la: %d", arr[i]);
                    isEvenNumber = true;
                    break;
                }
            }

            if(!isEvenNumber){
                System.out.printf("\n-1");
            }

        }
    }
}
