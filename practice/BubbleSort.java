package sample;

import java.util.Arrays;

public class BubbleSort {    // 옆에 값이랑 비교해서 큰 값을 뒤로
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 마지막 값은 비교할 필요가 없어서 -i-1 해줌
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100)+1;
        }
        
        System.out.println("정렬되기 전 배열: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("버블정렬된  배열: " + Arrays.toString(arr));
    }
}
