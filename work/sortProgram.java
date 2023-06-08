package work;

import java.util.Arrays;
import java.util.Scanner;

public class sortProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("몇 개를 입력할건가요 ?");
        n = sc.nextInt();
        System.out.println("하나씩 입력하고 엔터를 누르세요.");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("정렬되기 전 배열 :" + Arrays.toString(arr));

        // Sort program
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("정렬된 배열 : " + Arrays.toString(arr));
    }
}
