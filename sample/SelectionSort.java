package sample;

import java.util.Arrays;

public class SelectionSort {    // 처음부터 끝까지 비교하여 젤 작은 값을 맨 앞으로
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            
            // 현재 인덱스 이후의 값들 중에서 가장 작은 값을 찾음
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 현재 인덱스와 가장 작은 값의 인덱스에 있는 요소를 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100)+1;
        }

        System.out.println("정렬되기 전 배열: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("선택정렬된  배열: " + Arrays.toString(arr));
    }
}
